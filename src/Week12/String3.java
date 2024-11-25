package Week12;

public class String3 {
    public static void main(String[] args) {
        String s = "abc";
        String t = new String("abc");
        System.out.println(s == t);
        System.out.println(s.equals(t));
    }
}
