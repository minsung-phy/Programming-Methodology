package Final_2nd.Ch6;

public class multiplicationTables {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            // loop invariant : 구구단의 i-1 단까지 출력했음
            for (int j = 1; j < 10; j++) {
                // 구구단의 i-1 단까지 출력하고, i단의 j항을 출력할 차례임
                System.out.print(i + "x" + j + "=" + (i * j) + " ");
            }
            System.out.println();
        }
    }
}
