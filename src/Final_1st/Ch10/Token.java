package Final_1st.Ch10;

import java.util.StringTokenizer;

public class Token {
    public static void main(String[] args) {
        String s1 = "경기도 안산시 상록구";
        StringTokenizer t1 = new StringTokenizer(s1, " ");
        String province = t1.nextToken();
        System.out.println(province);
        String city = t1.nextToken();
        System.out.println(city);
        String district = t1.nextToken();
        System.out.println(district);

        System.out.println();

        String s2 = "$24.99";
        StringTokenizer t2 = new StringTokenizer(s2, "$.");
        System.out.println(t2.nextToken());
        System.out.println(t2.nextToken());
    }
}
