package Week2;

public class Demo {
    public static void main(String[] args) {
        boolean b = false;
        b = (b && true) || false;
        System.out.println(!b);

        int r = 3;
        double pi = 3.14;
        System.out.println(2 * pi * r > 20);

        String who = args[0];
        String whom = args[1];
        System.out.println(who + "은(는) " + whom + "을(를) 좋아합니다.");
    }
}
