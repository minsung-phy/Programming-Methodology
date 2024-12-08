package Final_3rd.Ch6.Ball2;

import javax.swing.*;
import java.awt.*;

public class AnimationWriters extends JPanel { // AnimationWriter 상자와 공의 애니메이션 디스플레이
    private BoxWriter box_writer; // 상자 그리는 객체
    private BallWriters ball_writers; // 공 그리는 객체

    /** Constructor AnimationWriter 상자와 공을 그리는 View 객체를 생성
     * @param b 상자 그리는 객체
     * @param l 공 그리는 객체
     * @param size 프레임의 크기 */
    public AnimationWriters(BoxWriter b, BallWriters l, int size) {
        box_writer = b;
        ball_writers = l;
        JFrame f = new JFrame();
        f.getContentPane().add(this);
        f.setTitle("Bounce");
        f.setSize(size, size + 22);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    /** paintComponent 상자와 공을 그리기
     * @param g 그래픽스 펜 */
    public void paintComponent(Graphics g) {
        box_writer.paintComponent(g);
        ball_writers.paintComponent(g);
    }
}
