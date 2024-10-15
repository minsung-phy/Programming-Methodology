package Week7.DiceGame;

import java.awt.*;
import javax.swing.*;

public class GameBoard extends JPanel {
    private int WIDTH = 500;
    private int HEIGHT = 500;
    private Player player1;
    private Player player2;

    public GameBoard (Player p1, Player p2) {
        player1 = p1;
        player2 = p2;
        JFrame f = new JFrame();
        f.getContentPane().add(this);
        f.setTitle("주사위 게임");
        f.setSize(WIDTH, HEIGHT);
        f.setVisible(true);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public void paintComponent (Graphics g) {
        // 베경색 설정
        g.setColor(Color.white);
        g.fillRect(0, 0, WIDTH, HEIGHT);

        // 플레이어 1 정보 출력
        g.setColor(Color.black);
        g.drawString(player1.name(), 110, 180);
        g.drawString("누적 점수: " + player1.points(), 110, 220);
        if (player1.rolled() != null)
            g.drawString(player1.rolled().face1() + ", " + player1.rolled().face2(), 110, 300);

        // 플레이어 2 정보 출력
        g.drawString(player2.name(), 350, 180);
        g.drawString("누적 점수: " + player2.points(), 350, 220);
        if (player2.rolled() != null)
            g.drawString(player2.rolled().face1() + ", " + player2.rolled().face2(), 350, 300);

        // 결과 출력
        if (player1.rolled() != null && player2.rolled() != null) {
            if (player1.wins()) {
                g.setColor(Color.RED);
                g.drawString("이겼다 !", 110, 260);
            }
            else if (player2.wins()) {
                g.setColor(Color.BLUE);
                g.drawString("이겼다 !", 350, 260);
            }
            else {
                g.setColor(Color.BLUE);
                g.drawString("비겼다 !", 240, 260);
            }
        }
    }

}
