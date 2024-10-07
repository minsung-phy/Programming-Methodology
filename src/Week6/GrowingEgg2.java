package Week6;

import java.awt.*;
import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class GrowingEgg2 extends JPanel {

    private final int NET_SIZE = 400;
    private int egg_width = 60;
    private int egg_height = 40;
    private int x = 170;
    private int y = 180;
    private boolean isFirstActivation = true;  // 최초 실행 여부를 확인하는 플래그

    public GrowingEgg2() {
        JFrame f = new JFrame();
        f.setTitle("Egg");
        f.setSize(NET_SIZE, NET_SIZE);
        f.getContentPane().add(this);
        f.setVisible(true);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        // 창의 활성화/비활성화를 감지하는 WindowListener 추가
        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowActivated(WindowEvent e) {
                if (isFirstActivation) {
                    // 처음 활성화 시에는 크기를 증가시키지 않음
                    isFirstActivation = false;  // 최초 실행 후에는 플래그를 false로 변경
                }
                else {
                    // 창이 다시 활성화될 때마다 타원의 크기를 증가시킴
                    egg_width += 60;
                    egg_height += 40;

                    // 타원을 다시 그리도록 repaint 호출
                    repaint();
                }
            }
        });
    }

    public void paintComponent(Graphics g) {
        g.setColor(Color.green);
        g.fillRect(0, 0, NET_SIZE, NET_SIZE);

        // 타원의 중심 좌표 계산
        x = (NET_SIZE / 2) - (egg_width / 2);
        y = (NET_SIZE / 2) - (egg_height / 2);

        g.setColor(Color.yellow);
        g.fillOval(x, y, egg_width, egg_height);
    }

    public static void main(String[] args) {
        new GrowingEgg2();
    }
}
