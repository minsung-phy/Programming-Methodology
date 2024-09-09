package Week2;

public class Slogan {
    public static void main(String[] args) {
        String slogan = "창의와 나눔으로 세상에 힘이 되는 한양";
        System.out.println(slogan);
        System.out.println(slogan.length()); // 길이 반환 method -> 내장 method로 직접 정의하지 않아도 사용 가능

        String slogan2 = "   " + slogan + "   ";
        System.out.println(slogan2 + "!");
        System.out.println(slogan2.length());

        String slogan3 = slogan2.trim(); // 좌우 끝 공백 없애는 method
        System.out.println(slogan3 + "!");
        System.out.println(slogan);
        System.out.println(slogan3);
        System.out.println(slogan == slogan3); // 동일한 객체인지 비교. 즉, 두 객체가 메모리 상에서 같은 위치에 있는가? -> false
        System.out.println(slogan.equals(slogan3)); // 두 객체의 내용이 동일한지 비교. -> true
        System.out.println(slogan.charAt(5)); // slogan의 5번째 인덱스에 있는 문자를 출력
        System.out.println(slogan.substring(4, 6)); // slogan 문자열에서 4번째부터 6번째 인덱스 직전까지의 부분 문자열을 반환

        String slogan_E = "Hanyang: Ancient Capital, Modern Academics";
        System.out.println(slogan_E.toUpperCase()); // slogan_E 문자열을 모두 대문자로 반환하여 출력
        System.out.println(slogan_E.toLowerCase()); // slogan_E 문자열을 모두 소문자로 반환하여 출력
        System.out.println(slogan_E.indexOf("o")); // slogan_E 문자열에서 첫 번째로 등장하는 "o"의 위치(인덱스)를 반환
        System.out.println(slogan_E.indexOf("o",6)); // slogan_E 문자열에서 6번째 이후에 등장하는 "o"의 위치(인덱스)를 반환
        System.out.println("a".compareTo("c")); // "a"와 "c"의 아스키 코드 값을 비교하여 그 차이를 반환. 작은 값이 앞에 오면 음수, 같으면 0, 더 큰 값이 앞에 오면 양수 반환.
        System.out.println("C".compareTo("A"));
    }
}
