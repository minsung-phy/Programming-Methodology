package Week4.Clock;

import javax.swing.*;
import java.time.LocalTime;

public class View {
    void show(LocalTime t) {
        System.out.println(t);
    }

    void showSwing(LocalTime t) {
        JOptionPane.showMessageDialog(null, t);
    }
}
