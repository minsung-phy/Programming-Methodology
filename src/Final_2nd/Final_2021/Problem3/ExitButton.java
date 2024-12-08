package Final_2nd.Final_2021.Problem3;

import java.awt.event.*;
import javax.swing.*;

public class ExitButton extends JButton implements ActionListener {
	
	public ExitButton() {
		super("Exit");
		addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {
		System.exit(0);
	}

}
