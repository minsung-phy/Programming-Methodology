package Final_1st.Ch9.Throb;

import java.awt.*;

public class ThrobPanel {
    private int panel_size = 200;
    private int location;
    private int ball_size;
    private Color c;
    private ThrobbingBall ball;

    public ThrobPanel(int size, ThrobbingBall b) {
        ball_size = size;
        ball = b;
    }

    public Color getColor() {
        return c;
    }

    public void setColor(Color new_color) {
        c = new_color;
    }

    public void paintComponent(Graphics g) {
        setColor(c);
        if (ball.isLarge())
            g.fillOval(ball_size, ball_size, 20, 20);
        else
            g.fillOval(ball_size-50, ball_size-50, 20, 20);
    }

    public void repaint() {
        repaint();
    }
}
