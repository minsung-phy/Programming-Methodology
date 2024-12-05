package Final_1st.Ch10;

import javax.swing.*;

public class Exception1 {
    public static void main(String[] args) {
        int n = readInt();
        try {
            String answer = 100 + " 나누기 " + n + " = " + (100 / n);
            JOptionPane.showMessageDialog(null, answer);
        } catch (java.lang.ArithmeticException e) {
            JOptionPane.showMessageDialog(null, e.getMessage() + " : 0으로 나눌 수 없습니다.");
        }
    }

    private static int readInt() {
        int n;
        String input = JOptionPane.showInputDialog("정수를 주세요. 100에서 나누어 드립니다.");
        try {
            n = Integer.parseInt(input.trim());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, e.getMessage() + " 정수가 아닙니다."); // getMessage : 발생한 오류를 설명하는 메시지 리턴
            n = readInt();
        }
        return n;
    }
}
