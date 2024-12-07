package Final_2nd.Ch9.Counter_Border;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static java.lang.System.exit;

public class ExitButton extends JButton implements ActionListener {
    public ExitButton(String label) {
        super(label);
        addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        exit(0);
    }
}
