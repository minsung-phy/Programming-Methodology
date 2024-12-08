package Final_3rd.Ch6.Ball2;

import java.awt.*;

public class BallWriters { // BallWriter : 움직이는 공을 그림
    private MovingBall ball1;
    private MovingBall ball2;
    private Color balls_color1;
    private Color balls_color2;


    /** Constructor BallWriter 움직이는 공을 그림
     * @param x1, x2 공 객체
     * @param c1, c2 공의 색깔 */
    public BallWriters(MovingBall x1, MovingBall x2, Color c1, Color c2) {
        ball1 = x1;
        ball2 = x2;
        balls_color1 = c1;
        balls_color2 = c2;
    }

    /** paintComponent 공 그리기
     * @param g 그래픽스 펜 */
    public void paintComponent(Graphics g) {
        int radius;

        g.setColor(balls_color1);
        radius = ball1.radiusOf();
        g.fillOval(ball1.xPosition() - radius, ball1.yPosition() - radius, radius * 2, radius * 2);

        g.setColor(balls_color2);
        radius = ball2.radiusOf();
        g.fillOval(ball2.xPosition() - radius, ball2.yPosition() - radius, radius * 2, radius * 2);
    }
}
