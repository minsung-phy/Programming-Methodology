package Final_3rd.Final_2021.Problem3;

import java.awt.event.*;
import javax.swing.*;

public class DigitButton2 extends JButton implements ActionListener {

	private GugudanFrame frame;

	public DigitButton2(int d, GugudanFrame f) {
		super(Integer.toString(d));
		frame = f;
		addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		frame.clicked2(Integer.parseInt(getText()));
	}

}