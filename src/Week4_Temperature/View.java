package Week4_Temperature;

import javax.swing.*;
import java.text.DecimalFormat;

public class View {
    double getTemperature() {
        String message = "섭씨 온도를 정수로 입력해주세요.";
        String input = JOptionPane.showInputDialog(message);
        double c = Double.parseDouble(input);
        return c;
    }

    void showTemperature(double c, double f) {
        DecimalFormat formatter = new DecimalFormat("0.0");
        System.out.println("섭씨 " + c + "도는 ");
        System.out.println("화씨로 " + formatter.format(f) + "도 입니다.");
    }
}
