package Final_2nd.Ch9.Counter_Border;

import javax.swing.*;
import java.awt.*;

public class CounterFrame extends JFrame {
    private Counter count;
    private JLabel label = new JLabel("count = 0");
    private Drawing drawing;

    public CounterFrame(Counter c, Drawing panel) {
        count = c;
        drawing = panel;

        Container cp = getContentPane();
        cp.setLayout(new BorderLayout()); // 나란히 가로로 나열
        JPanel p1 = new JPanel(new FlowLayout());
        JPanel p2 = new JPanel(new FlowLayout());

        p1.add(label);
        p2.add(new CountButton("OK", count, this));
        p2.add(new ExitButton("Exit"));

        cp.add(p1, BorderLayout.NORTH);
        cp.add(drawing, BorderLayout.CENTER);
        cp.add(p2, BorderLayout.SOUTH);

        setTitle("Counter");
        setSize(200, 280);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public void update() {
        label.setText("count = " + count.countOf());
        drawing.repaint();
    }
}
