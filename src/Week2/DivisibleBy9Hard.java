package Week2;

import javax.swing.*;

public class DivisibleBy9Hard {
    public static void main(String[] args) {
        String message = "정수를 주세요.";
        String input = JOptionPane.showInputDialog(message);
        int integer = Math.abs(Integer.parseInt(input));

        int a = integer % 10;
        int b = (integer / 10) % 10;
        int c = (integer / 100) % 10;
        int d = (integer / 1000) % 10;
        int e = integer / 10000;
        int sum = a + b + c + d + e;

        boolean divided = sum % 9 == 0;

        JOptionPane.showMessageDialog(null, "정수 " + integer + "은(는) 9로 나누어 떨어지나? " + divided);
    }
}
