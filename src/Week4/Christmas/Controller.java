package Week4.Christmas;

import java.time.LocalDate;
import java.time.Period;

public class Controller {
    void control(Model m, View v) {
        LocalDate start = v.getData();
        LocalDate finish = LocalDate.of(2024,12,25);
        Period remain = m.remainChristmas(start, finish);
        v.showSwing(remain);
    }
}
