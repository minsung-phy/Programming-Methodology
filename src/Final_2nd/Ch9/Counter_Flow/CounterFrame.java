package Final_2nd.Ch9.Counter_Flow;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CounterFrame extends JFrame {
    private Counter count;
    private JLabel label = new JLabel("count = 0");

    public CounterFrame(Counter c) {
        count = c;
        Container cp = getContentPane();
        cp.setLayout(new FlowLayout()); // 나란히 가로로 나열
        cp.add(label);
        cp.add(new CountButton("OK", count, this));
        setTitle("Counter");
        setSize(200, 60);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public void update() {
        label.setText("count = " + count.countOf());
    }
}
