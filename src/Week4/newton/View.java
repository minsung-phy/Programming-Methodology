package Week4.newton;

import javax.swing.*;
import java.text.DecimalFormat;

public class View {
    double getM() {
        String input = JOptionPane.showInputDialog("질량(m)을 입력하세요.");
        double m = Double.parseDouble(input);
        return m;
    }

    double getA() {
        String input = JOptionPane.showInputDialog("가속도(a)을 입력하세요.");
        double a = Double.parseDouble(input);
        return a;
    }

    void showSwing(double f) {
        DecimalFormat formatter = new DecimalFormat("0.0");
        JOptionPane.showMessageDialog(null,"힘은 " + formatter.format(f) + "입니다.");
    }

}
