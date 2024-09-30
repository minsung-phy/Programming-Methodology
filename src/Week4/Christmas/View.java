package Week4.Christmas;

import java.time.LocalDate;
import java.time.Period;
import javax.swing.*;

public class View {
    LocalDate getData() {
        return LocalDate.now();
    }

    void showSwing(Period remain) {
        JOptionPane.showMessageDialog(null, "올해 크리스마스까지 " + remain.getMonths() + "달하고 " + remain.getDays() + "일 남았다!");
    }
}
