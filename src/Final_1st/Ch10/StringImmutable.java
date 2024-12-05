package Final_1st.Ch10;

public class StringImmutable {
    public static void main(String[] args) {
        System.out.println("String과 char[] 비교");
        String s1 = "abc";
        char[] t1 = new char[3];
        t1[0] = 'a';
        t1[1] = 'b';
        t1[2] = 'c';
        System.out.println("s1 == t1는? Error");
        System.out.println("s1.equals(t1)는? " + s1.equals(t1));
        System.out.println();

        System.out.println("String끼리의 비교");
        String s2 = "abc";
        String t2 = "abc";
        System.out.println("s2 == t2는? " + (s2 == t2));
        System.out.println("s2.equals(t2)는? " + s2.equals(t2));
        System.out.println("즉, 같은 주소를 가르킴");
        System.out.println();

        System.out.println("new String을 사용하여 새로 선언했을 시 비교");
        String s3 = "abc";
        String t3 = new String("abc");
        System.out.println("s3 == t3은? " + (s3 == t3));
        System.out.println("s3.equals(t3)은? " + s3.equals(t3));
        System.out.println("즉, 다른 주소를 가르킴. 하지만 문자열은 똑같음.");
        System.out.println();

        System.out.println("new String()과 문자열의 합");
        String s4 = "abc";
        String t4 = new String("ab") + "c";
        System.out.println("s4 == t4는? " + (s4 == t4));
        System.out.println("s4.equals(t4)는? " + s4.equals(t4));
        System.out.println();

        System.out.println("new String()과 문자열의 합 이후 s에 t 대입");
        String s5 = "abc";
        String t5 = new String("ab") + "c";
        s5 = t5;
        System.out.println("s5 == t5는? " + (s5 == t5));
        System.out.println("s5.equals(t5)는? " + s5.equals(t5));
    }
}
