package Week11.Ball;

public class StarterBall {
    public static void main(String[] args) throws InterruptedException {
        ThrobbingBall ball = new ThrobbingBall();
        ThrobPanel panel = new ThrobPanel(300, ball);
        ColorButton button = new ColorButton(panel);
        new ThrobFrame(300, panel, button);

        ThrobController controller = new ThrobController(panel, ball, 5);
        controller.run();
    }
}
