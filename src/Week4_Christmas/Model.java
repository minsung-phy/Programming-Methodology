package Week4_Christmas;

import java.time.LocalDate;
import java.time.Period;

public class Model {
    Period remainChristmas(LocalDate start, LocalDate finish) {
        return Period.between(start, finish);
    }
}
