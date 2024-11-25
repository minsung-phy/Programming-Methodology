package Week12;

public class String1 {
    public static void main(String[] args) {
        String s = "abc";
        char[] t = new char[3];
        t[0] = 'a';
        t[1] = 'b';
        t[2] = 'c';
        // System.out.println(s == t); // error
        System.out.println(s.equals(t)); // false
    }
}
