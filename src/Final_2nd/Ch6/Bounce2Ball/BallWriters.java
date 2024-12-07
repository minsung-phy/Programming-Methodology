package Final_2nd.Ch6.Bounce2Ball;

import java.awt.*;

/** BallWriter 움직이는 공을 그림 */
public class BallWriters {
    private MovingBall ball1; // 공 객체 1
    private MovingBall ball2; // 공 객체 2
    private Color balls_color1; // 공1의 색깔
    private Color balls_color2; // 공2의 색깔

    /** constructor BallWriter
     * @param x1 공 객체 1
     * @param x2 공 객체 2
     * @param c1 공1의 색깔
     * @param c2 공2의 색깔
     */
    public BallWriters(MovingBall x1, MovingBall x2, Color c1, Color c2) {
        ball1 = x1;
        ball2 = x2;
        balls_color1 = c1;
        balls_color2 = c2;
    }

    /** paintComponent 공 그리기
     * @param g 그래픽스 펜
     */
    public void paintComponent(Graphics g) {
        g.setColor(balls_color1);
        int radius1 = ball1.radiusOf();
        g.fillOval(ball1.xPosition() - radius1, ball1.yPosition() - radius1, radius1 * 2, radius1 * 2);

        g.setColor(balls_color2);
        int radius2 = ball2.radiusOf();
        g.fillOval(ball2.xPosition() - radius2, ball2.yPosition() - radius2, radius2 * 2, radius2 * 2);
    }
}
