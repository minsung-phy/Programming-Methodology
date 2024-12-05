package Final_1st.Ch9.Throb;

import javax.swing.*;
import java.awt.*;

public class ThrobFrame extends JFrame {
    private int frame_size = 200;
    private JPanel panel;
    private ColorButton button;

    public ThrobFrame(int size, JPanel f, ColorButton b) {
        frame_size = size;
        panel = f;
        button = b;

        Container cp = getContentPane();
        cp.setLayout(new BorderLayout());


        cp.add(panel, BorderLayout.CENTER);
        cp.add(button, BorderLayout.SOUTH);

        setTitle("Throb");
        setSize(frame_size, frame_size + 80);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
