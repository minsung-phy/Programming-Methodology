package Week6;

import java.awt.*;
import javax.swing.*;

public class GrowingEgg2_2 extends JPanel {
    private final int NET_SIZE = 400;
    private int egg_width = 60;
    private int egg_height = 40;
    private int x = 170;
    private int y = 180;

    public GrowingEgg2_2() {
        JFrame f = new JFrame();
        f.getContentPane().add(this);
        f.setTitle("Egg");
        f.setSize(NET_SIZE, NET_SIZE);
        f.setVisible(true);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public void paintComponent(Graphics g) {
        g.setColor(Color.green);
        g.fillRect(0, 0, NET_SIZE, NET_SIZE);
        g.setColor(Color.yellow);
        g.fillOval(x, y, egg_width, egg_height);
        egg_width += 60;
        x -= 30;
        egg_height += 40;
        y -= 20;
    } // Draw 하고 나서 변수를 업데이트 해 줌. 다시 그럴 떄 해당 정보 반영.

    public static void main(String[] args) {
        new GrowingEgg2_2();
    }
}
