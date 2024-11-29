package TeamProject;

import java.io.*;
import java.util.*;

public class PayrollReader { // Model
    private BufferedReader infile;
    private final String EOF = "!";
    private String name;
    private int hoursPerWeek, weeksPerMonth, payrate;

    public PayrollReader(String file_name) {
        try {
            infile = new BufferedReader(new FileReader(file_name));
        }
        catch (Exception e) {
            System.out.println("PayrollReader Error - bad file name: " + file_name);
            throw new RuntimeException(e.toString());
        }
    }

    public String name() { return name; }
    public int hoursPerWeek() { return hoursPerWeek; }
    public int weeksPerMonth() { return weeksPerMonth; }
    public int payrate() { return payrate; }

    public void close() {
        try { infile.close(); }
        catch (IOException e) {
            System.out.println("PayrollReader Warning - file close failed");
        }
    }

    public boolean getNextRecord() {
        boolean result = false;
        try {
            if (infile.ready()) {
                String line = infile.readLine();
                StringTokenizer t = new StringTokenizer(line, ",");
                String s = t.nextToken().trim();
                if (! s.equals(EOF))
                    if (t.countTokens() == 3) {
                        name = s;
                        hoursPerWeek = Integer.parseInt(t.nextToken().trim());
                        weeksPerMonth = Integer.parseInt(t.nextToken().trim());
                        payrate = Integer.parseInt((t.nextToken().trim()));
                        result = true;
                    }
                    else {
                        throw new RuntimeException(line);
                    }
            }
        }
        catch (IOException e) {
            System.out.println("PayrollReader Error : " + e.getMessage());
        }
        catch (RuntimeException e) {
            System.out.println("PayrollReader Error - bad record format: " + e.getMessage() + " Skipping");
            result = getNextRecord(); // 다음 줄 시도
        }
        return result;
    }
}
