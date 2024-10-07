package Week6;

import java.awt.*;
import javax.swing.*;

public class GrowingEgg1 extends JPanel {
    public GrowingEgg1() {
        JFrame f = new JFrame();
        f.setTitle("Egg");
        f.setSize(400, 400);
        f.getContentPane().add(this);
        f.setVisible(true);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public void paintComponent(Graphics g) {
        g.setColor(Color.green);
        g.fillRect(0, 0, 400, 400);
        g.setColor(Color.yellow);
        g.fillOval(200-30, 200-20, 60, 40);
    }

    public static void main(String[] args) {
        new GrowingEgg1();
    }
}
