package Week2;

public class MathDemo {
    public static void main(String[] args) {
        double r = 3.14;
        System.out.println(r);

        int n = 3;
        double r2 = n; // implicit type casting
        System.out.println(r2);

        n = (int)r2 + 1; // explicit type casting
        System.out.println(n);

        System.out.println(Math.sqrt(r));
        System.out.println(Math.pow(r, 2));
        System.out.println(Math.abs(-r));
    }
}
