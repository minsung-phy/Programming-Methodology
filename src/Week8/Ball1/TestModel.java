package Week8.Ball1;

public class TestModel {
    public static void main(String[] args) {
        Box box = new Box(50);
        MovingBall ball = new MovingBall(25, 25, 10, box, 5, 3);
        while (true) {
            ball.move(1);
            System.out.println("x = " + ball.xPosition() + "; y = " + ball.yPosition());
        }
    }
}
