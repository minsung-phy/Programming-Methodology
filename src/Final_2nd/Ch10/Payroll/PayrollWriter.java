package Final_2nd.Ch10.Payroll;

import java.io.FileWriter;
import java.io.PrintWriter;

public class PayrollWriter {
    private PrintWriter outfile;

    public PayrollWriter(String file_name) {
        try {
            outfile = new PrintWriter(new FileWriter(file_name));
        } catch (Exception e) {
            System.out.println("PayrollWriter Error : " + file_name);
            throw new RuntimeException(e.toString());
        }
    }

    public void close() {
        outfile.close();
    }

    public void printCheck(String name, int payment) {
        outfile.println(name + ", " + payment);
    }

    public void printCheck(String s) {
        outfile.println(s);
    }
}
