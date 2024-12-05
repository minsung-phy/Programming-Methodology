package Final_1st.Ch7.PuzzleGame;

import javax.swing.*;
import java.awt.*;

public class PuzzleWriter extends JPanel {
    private SlidePuzzleBoard board;
    private final int SIZE;

    public PuzzleWriter(SlidePuzzleBoard b) {
        board = b;
        SIZE = 30;
        JFrame f = new JFrame();
        f.getContentPane().add(this);
        f.setTitle("Puzzle Game");
        f.setSize(SIZE * 6, SIZE * 6 + 28);
        f.setVisible(true);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public void paintComponent(Graphics g) {
        g.setColor(Color.YELLOW);
        g.fillRect(0, 0, SIZE * 6, SIZE * 6);
        PuzzlePiece[][] r = board.board();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                paintPiece(g, r[i][j], i, j);
            }
        }
    }

    private void paintPiece(Graphics g, PuzzlePiece p, int i, int j) {
        int x = SIZE + (SIZE * j);
        int y = SIZE + (SIZE * i);
        if (p != null) {
            g.setColor(Color.WHITE);
            g.fillRect(x, y, SIZE, SIZE);
            g.setColor(Color.BLACK);
            g.drawRect(x, y, SIZE, SIZE);
            int face_value = p.faceValue();
            if (face_value < 10)
                g.drawString(face_value + "", x+11, y+20);
            else
                g.drawString(face_value + "", x+7, y+20);
        }
        else {
            g.setColor(Color.BLACK);
            g.fillRect(x, y, SIZE, SIZE);
        }
    }

    // 퍼즐 보드를 다시 그리는 메소드
    public void displayPuzzle() {
        this.repaint();
    }

    public void printError(String s) {
        JOptionPane.showMessageDialog(null, s);
    }

}
