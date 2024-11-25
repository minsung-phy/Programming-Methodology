package Week11.Ball;

import static java.lang.Thread.sleep;

public class ThrobController {
    private ThrobPanel writer;
    private ThrobbingBall ball;
    private int time;

    public ThrobController(ThrobPanel w, ThrobbingBall b, int delay_time) {
        writer = w;
        ball = b;
        time = delay_time;
    }

    void run() throws InterruptedException {
        while(true) {
            if (!ball.isLarge()) {
                writer.ball_size = 100;
                writer.repaint();
                sleep(time);
                ball.throb();
            }
            else {
                writer.ball_size = 50;
                writer.repaint();
                sleep(time);
                ball.throb();
            }
        }
    }
}
