package Week4_HelloWorld;

public class HelloWorld {
    public static void main(String[] args) {
        Model m = new Model(); // Model 객체 선언 후 m 변수에 참조 저장
        View v = new View(); // View 객체 선언 후 v 변수에 참조 저장
        Controller c = new Controller(); // Controller 객체 선언 후 c 변수에 참조 저장
        c.control(m, v); // Controller의 control 메서드를 호출하여 m과 v를 전달
    }
}
