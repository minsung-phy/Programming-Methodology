package Final_3rd.Final_2021.Problem3;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GugudanFrame extends JFrame {

	private DigitButton1[] digits1 = new DigitButton1[8];
	private DigitButton2[] digits2 = new DigitButton2[8];
	private JLabel solution = new JLabel();
	private JLabel ox = new JLabel();
	private int first = 0;
	// (first == 0) - DigitButton1을 아직 누르지 않았음
	// (first != 0) - DigitButton1을 눌렀음

	public GugudanFrame() {
		Container cp = getContentPane();
		cp.setLayout(new GridLayout(7,1));

		JPanel p1 = new JPanel(new GridLayout(1,8));
		for (int i = 2; i <= 9; i++)
			p1.add(new DigitButton1(i, this));
		cp.add(p1);

		JPanel p2 = new JPanel(new FlowLayout());
		JLabel x = new JLabel();
		x.setText("X");
		p2.add(x);
		cp.add(p2);

		JPanel p3 = new JPanel(new GridLayout(1,8));
		for (int i = 2; i <= 9; i++)
			p3.add(new DigitButton2(i, this));
		cp.add(p3);

		JPanel p4 = new JPanel(new FlowLayout());
		p4.add(new JLabel("="));
		cp.add(p4);

		JPanel p5 = new JPanel(new FlowLayout());
		p5.add(solution);
		cp.add(p5);

		JPanel p6 = new JPanel(new FlowLayout());
		p6.add(ox);
		cp.add(p6);

		JPanel p7 = new JPanel(new FlowLayout());
		p7.add(new MoreButton(this));
		p7.add(new ExitButton());
		cp.add(p7);

		question();

		setTitle("구구단 연습");
		setSize(300,300);
		setVisible(true);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}

	public void question() {
		int first = (int)(Math.random() * 8) + 2;
		int second = (int)(Math.random() * 8) + 2;
		// 해답을 쓰고
		solution.setText(first * second + "");
		// 정오답 여부는 빈칸으로
		ox.setText("");
	}

	public void clicked1(int digit) {
		// 맨 윗 줄의 숫자를 클릭
		if (first == 0) {
			digits1[0] = new DigitButton1(digit, this);
			first++;
		}
		first++;
	}

	public void clicked2(int digit) {
		// 아랫 줄의 숫자를 클릭
		if (first > 0) {
			digits2[0] = new DigitButton2(digit, this);
			int my_sol = Integer.parseInt(digits1[0].getText()) * digit;
			int sol = Integer.parseInt(solution.getText());
			if (my_sol == sol) {
				ox.setText("정답");
			}
			else {
				ox.setText("오답");
			}
			first = 0;
		}
	}

	public static void main(String[] args) {
		new GugudanFrame();
	}

}
