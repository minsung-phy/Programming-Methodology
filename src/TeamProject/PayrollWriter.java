package TeamProject;

import java.io.*;

public class PayrollWriter { // Model
    private PrintWriter outfile;

    public PayrollWriter(String file_name) {
        try {
            outfile = new PrintWriter(new FileWriter(file_name));
            // CSV 헤더 추가
            outfile.println("Name,MonthlySalary");
        }
        catch (Exception e) {
            System.out.println("PayrollWriter Error: " + file_name);
            throw new RuntimeException(e.toString());
        }
    }

    public void close() {
        outfile.close();
    }

    public void printCheck(String name, int monthlySalary) {
        outfile.println(name + "," + monthlySalary);
    }

    public void printCheck(String s) {
        outfile.println(s);
    }
}

