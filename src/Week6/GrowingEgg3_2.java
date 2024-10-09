package Week6;

import java.awt.*;
import javax.swing.*;

public class GrowingEgg3_2 extends JPanel {
    private int net_size;
    private int egg_width = 60;
    private int egg_height = 40;
    private int x = 170;
    private int y = 180;

    public GrowingEgg3_2(int frame_size) {
        net_size = frame_size;
        JFrame f = new JFrame();
        f.getContentPane().add(this);
        f.setTitle("Egg");
        f.setSize(net_size, net_size);
        f.setVisible(true);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public void paintComponent(Graphics g) {
        g.setColor(Color.green);
        g.fillRect(0, 0, net_size, net_size);
        g.setColor(Color.yellow);
        x = (net_size / 2) - (egg_width / 2);
        y = (net_size / 2) - (egg_height / 2);
        g.fillOval(x, y, egg_width, egg_height);
        egg_width += 60;
        egg_height += 40;
    } // Draw 하고 나서 변수를 업데이트 해 줌. 다시 그럴 떄 해당 정보 반영.

    public static void main(String[] args) {
        new GrowingEgg3_2(400);
    }
}
