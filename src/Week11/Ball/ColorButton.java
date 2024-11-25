package Week11.Ball;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ColorButton extends JButton implements ActionListener {
    private ThrobPanel panel;

    public ColorButton(ThrobPanel f) {
        panel = f;
        addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (panel.getColor() == Color.RED)
            panel.setColor(Color.BLUE);
        else
            panel.setColor(Color.RED);
        panel.repaint();
    }
}
