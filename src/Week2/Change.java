package Week2;

public class Change {
    public static void main(String[] args) {
        int dollars = 3;
        int cents = 46;
        int money = dollars * 100 + cents;
        System.out.println("quarters = " + (money / 25));
        money = money % 25;
        System.out.println("dimes = " + (money / 10));
        money = money % 10;
        System.out.println("nickels = " + (money / 5));
        money = money % 5;
        System.out.println("pennies = " + money);

        System.out.println();

        int dollars2 = Integer.parseInt(args[0]);
        int cents2 = Integer.parseInt(args[1]);
        int money2 = dollars * 100 + cents;
        System.out.println("quarters = " + (money2 / 25));
        money2 = money2 % 25;
        System.out.println("dimes = " + (money2 / 10));
        money = money % 10;
        System.out.println("nickels = " + (money2 / 5));
        money2 = money2 % 5;
        System.out.println("pennies = " + money2);
    }
}
