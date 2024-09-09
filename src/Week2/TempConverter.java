package Week2;

import java.text.*;

public class TempConverter {
    public static void main(String[] args) {
        double c = Double.parseDouble(args[0]);
        double f = (9.0 / 5.0) * c + 32;
        System.out.println("섭씨로 " + c + "도는 화씨로 " + f + "도 입니다.");

        DecimalFormat formatter = new DecimalFormat("0.0");
        System.out.println("섭씨로 " + c + "도 = 화씨 " + f + "도");
    }
}
