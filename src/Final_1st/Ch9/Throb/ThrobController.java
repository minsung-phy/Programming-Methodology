package Final_1st.Ch9.Throb;

public class ThrobController {
    private ThrobPanel writer;
    private ThrobbingBall ball;
    private int time;

    public ThrobController(ThrobPanel w, ThrobbingBall b, int delay_time) {
        writer = w;
        ball = b;
        time = delay_time;
    }

    public void run() throws InterruptedException {
        while(true) {
            ball.throb();
            writer.repaint();
            Thread.sleep(time);
        }
    }

}
