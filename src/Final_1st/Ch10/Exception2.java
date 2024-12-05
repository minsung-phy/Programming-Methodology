package Final_1st.Ch10;

import javax.swing.*;
import java.awt.*;

public class Exception2 {
    public String readString(String prompt) {
        return JOptionPane.showInputDialog(prompt);
    }

    public int readInt(String prompt) {
        int n;
        String input = readString(prompt);
        try {
            n = Integer.parseInt(input.trim());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, e.getMessage() + " 정수가 아닙니다.");
            n = readInt(prompt); // 재시도
        }
        return n;
    }

    public static void main(String[] args) {
        int n = new Exception2().readInt("정수를 주세요. 100에서 나누어 드립니다.");
        try {
            String answer = "100에서 나누기 " + n + " = " + (100/n);
            JOptionPane.showMessageDialog(null, answer);
        } catch (java.lang.ArithmeticException e) {
            JOptionPane.showMessageDialog(null, e.getMessage() + " : 0으로 나눌 수 없습니다.");
        }
    }
}
