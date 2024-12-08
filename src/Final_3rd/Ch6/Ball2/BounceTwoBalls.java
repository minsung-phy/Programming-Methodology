package Final_3rd.Ch6.Ball2;

import java.awt.*;

public class BounceTwoBalls {
    public static void main(String[] args) {
        int box_size = 200;
        int ball1_radius = 6;
        int ball2_radius = 8;

        Box box = new Box(box_size);
        MovingBall ball1 = new MovingBall((int)(box_size / 3.0), (int)(box_size / 5.0), ball1_radius, box, 5, 10);
        MovingBall ball2 = new MovingBall((int)(box_size / 2.0), (int)(box_size / 3.0), ball2_radius, box, 3, 5);
        BallWriters ball_writer = new BallWriters(ball1, ball2, Color.red, Color.blue);
        BoxWriter box_writer = new BoxWriter(box);
        AnimationWriters writers = new AnimationWriters(box_writer, ball_writer, box_size);

        new BounceControllers(ball1, ball2, writers).runAnimation();
    }
}
