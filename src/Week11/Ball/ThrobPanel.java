package Week11.Ball;

import javax.swing.*;
import java.awt.*;

public class ThrobPanel extends JFrame {
    private int panel_size;
    private int location;
    public int ball_size = 20;
    private Color c = Color.RED;
    private ThrobbingBall ball;

    public ThrobPanel(int size, ThrobbingBall b) {
        panel_size = size;
        ball = b;
    }

    public Color getColor() {
        return c;
    }

    public void setColor(Color new_color) {
        c = new_color;
    }

    public void paintComponent(Graphics g) {
        g.setColor(c);

        // 공이 패널의 가운데에 위치하도록 좌표 계산
        location = (panel_size - ball_size) / 2;

        g.fillOval(location, location, ball_size, ball_size);
    }
}
