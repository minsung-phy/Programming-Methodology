package Week5;

import javax.swing.*;
import java.awt.*;

public class Canvas extends JPanel {
    public Canvas() { // 초기화 메소드 (constructor method)
        JFrame frame = new JFrame(); // javax.swing.*에 내장되어 있는 Class
        frame.setTitle("Canvas");
        frame.setSize(300, 200);
        frame.getContentPane().add(this);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public void paintComponent (Graphics g) {
        // g.setColor(Color.red);
        // g.drawString("Java!", 100, 60);
        g.setColor(Color.white);
        g.fillRect(0, 0, 300, 200);
        g.setColor(Color.red);
        g.drawRect(100, 60, 90, 60);
        g.fillOval(100, 60, 50, 50);
    }

    public static void main(String[] args) {
        new Canvas();
    }
}
