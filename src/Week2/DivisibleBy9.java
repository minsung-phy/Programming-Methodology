package Week2;

import javax.swing.JOptionPane;

public class DivisibleBy9 {
    public static void main(String[] args) {
        String message = "정수를 주세요.";
        String input = JOptionPane.showInputDialog(message);
        int integer = Integer.parseInt(input);
        boolean divided = integer % 9 == 0;

        JOptionPane.showMessageDialog(null, "정수 " + integer + "은(는) 9로 나누어 떨어지나? " + divided);
    }
}
