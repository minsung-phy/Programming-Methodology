package Final_1st.Ch6.Bounce_2Ball;

import java.awt.*;

public class BounceTwoBalls {
    public static void main(String[] args) {
        // 모델 객체 생성
        int box_size = 200;
        int balls_radius = 6;
        Box box = new Box(box_size);

        // 공을 상자의 적절한 위치에 둠
        MovingBall ball1 = new MovingBall((int)(box_size / 3.0), (int)(box_size / 5.0), balls_radius, box, 10, 5);
        MovingBall ball2 = new MovingBall((int)(box_size / 5.0), (int)(box_size / 6.0), balls_radius, box, 5, 2);
        BallWriters ball_writers = new BallWriters(ball1, ball2, Color.red, Color.blue);
        BoxWriter box_writer = new BoxWriter(box);
        AnimationWriters writer = new AnimationWriters(box_writer, ball_writers, box_size);

        // 컨트롤러 객체를 생성하고 애니메이션 시작
        new BounceControllers(ball1, ball2, writer).runAnimation();
    }
}
