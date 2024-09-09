package Week2;

import java.text.*;
import javax.swing.JOptionPane;

public class Mi2Km {
    public static void main(String[] args) {
        String message = "거리가 몇 마일입니까?";
        String input = JOptionPane.showInputDialog(message);
        int mile = Integer.parseInt(input);
        double km = mile * 1.60934;

        DecimalFormat formatter = new DecimalFormat("0.0");
        JOptionPane.showMessageDialog(null, mile + " 마일은 " + km + " 킬로미터 입니다.");
    }
}
