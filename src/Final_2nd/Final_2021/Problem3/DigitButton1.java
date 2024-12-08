package Final_2nd.Final_2021.Problem3;

import java.awt.event.*;
import javax.swing.*;

public class DigitButton1 extends JButton implements ActionListener {
	
	private GugudanFrame frame;
	
	public DigitButton1(int d, GugudanFrame f) {
		super(Integer.toString(d));
		frame = f;
		addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {
		frame.clicked1(Integer.parseInt(getText()));
	}

}