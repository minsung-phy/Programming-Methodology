package Week11.Ball;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ThrobFrame extends JFrame {
    private int frame_size;
    private ThrobPanel panel;
    private ColorButton button;

    public ThrobFrame(int size, ThrobPanel p, ColorButton b) {
        frame_size = size;
        panel = p;
        button = b;

        Container cp = getContentPane();
        cp.setLayout(new BorderLayout());
        cp.add(panel, BorderLayout.CENTER);
        cp.add(button, BorderLayout.SOUTH);
        setTitle("Throb");
        setSize(frame_size, frame_size + 100);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
