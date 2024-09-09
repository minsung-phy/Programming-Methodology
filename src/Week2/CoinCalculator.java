package Week2;

public class CoinCalculator {
    public static void main(String[] args) {
        System.out.println(9 * 25 + 2 * 10 + 0 * 5 + 6 * 1);

        int quarters = 9;
        int dimes = 2;
        int nickels = 0;
        int pennies = 6;
        int sum = quarters * 25 + dimes * 10 + nickels * 5 + pennies * 1;
        System.out.println(sum);
        int dollar = sum / 100;
        int cent = sum % 100;
        System.out.println("$" + dollar + "." + cent);

        int money = 100;
        System.out.println(money);
        money = money + 50;
        System.out.println(money);
    }
}
