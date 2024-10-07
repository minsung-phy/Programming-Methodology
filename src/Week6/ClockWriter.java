package Week6;

import javax.swing.*;
import java.awt.*;
import java.time.*;

public class ClockWriter extends JPanel {
    public ClockWriter() {
        int width = 200;
        // 프레임 생성
        JFrame frame = new JFrame();
        // 자신(패널)을 프레임에 끼우기
        frame.getContentPane().add(this);
        // 프레임 만들어 보여주기
        frame.setTitle("Clock");
        frame.setSize(width, width);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public void paintComponent(Graphics g) {
        int width = 200;
        // 바탕은 흰색으로
        g.setColor(Color.white);
        g.fillRect(0, 0, width, width);
        // 현재 시간 + 시침, 분침 각도 계산
        LocalTime now = LocalTime.now();
        int minutes_angle = 90 - now.getMinute() * 6; // 시계는 90도에서 시작, 1분당 6도
        int hours_angle = 90 - now.getHour() * 30; // 1시간당 30도
        // 시계 크기 설정
        int x = 50;
        int y = 50;
        int diameter = 100; // diameter : 지름
        // 시계 판 그리기
        g.setColor(Color.black);
        g.drawOval(x, y, diameter, diameter);
        // 분침 그리기
        g.setColor(Color.red);
        g.fillArc(x+5, y+5, diameter-10, diameter-10, minutes_angle, 5); // 지름은 좌, 우가 다 빠져야하므로 -5*2
        // 시침 그리기
        g.setColor(Color.blue);
        g.fillArc(x+25, y+25, diameter-50, diameter-50, hours_angle, -8);
    }

    public static void main(String[] args) {
        new ClockWriter();
    }
}
