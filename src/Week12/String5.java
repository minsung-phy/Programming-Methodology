package Week12;

public class String5 {
    public static void main(String[] args) {
        String s = "abc";
        String t = new String("ab") + "c";
        s = t;
        System.out.println(s == t);
        System.out.println(s.equals(t));
    }
}
