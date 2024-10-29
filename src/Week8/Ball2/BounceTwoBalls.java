package Week8.Ball2;

import java.awt.*;

public class BounceTwoBalls {
    public static void main(String[] args) {
        // 모델 객체 생성
        int box_size = 200;
        int balls_radius = 6;
        Box box = new Box(box_size);
        // 공을 상자의 적절한 위치에 둠
        MovingBall ball1 = new MovingBall((int)(box_size / 3.0), (int)(box_size / 5.0), balls_radius, box);
        MovingBall ball2 = new MovingBall((int)(box_size / 6.0), (int)(box_size / 10.0), balls_radius, box);
        BallWriters ball_writer = new BallWriters(ball1, ball2, Color.red, Color.BLUE);
        BoxWriter box_writer = new BoxWriter(box);
        AnimationWriters writer = new AnimationWriters(box_writer, ball_writer, box_size);
        // 컨트롤러 객체를 생성하고 애니메이션 시작
        new BounceControllers(ball1, ball2, writer).runAnimation();
    }
}
