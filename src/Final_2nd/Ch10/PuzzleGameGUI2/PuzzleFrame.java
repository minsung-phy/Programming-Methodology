package Final_2nd.Ch10.PuzzleGameGUI2;

import javax.swing.*;
import java.awt.*;

public class PuzzleFrame extends JFrame {
    private SlidePuzzleBoard board;
    private PuzzleButton[][] button_board;

    public PuzzleFrame(SlidePuzzleBoard b) {
        board = b;
        button_board = new PuzzleButton[4][4];

        Container cp = getContentPane();
        cp.setLayout(new BorderLayout());

        JPanel p1 = new JPanel(new FlowLayout());
        p1.add(new StartButton(board, this));

        JPanel p2 = new JPanel(new GridLayout(4, 4));
        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 4; col++) {
                button_board[row][col] = new PuzzleButton(board, this);
                p2.add(button_board[row][col]); // 버튼 객체를 Container cp에 추가
            }
        }

        cp.add(p1, BorderLayout.NORTH);
        cp.add(p2, BorderLayout.CENTER);

        update();

        setTitle("Slize Puzzle");
        setSize(250, 300);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public void update() {
        PuzzlePiece pp;
        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 4; col++) {
                pp = board.getPuzzlePiece(row, col);
                if (pp != null)
                    button_board[row][col].setText(Integer.toString(pp.face()));
                else
                    button_board[row][col].setText("");
            }
        }
    }

    public void finish() {
        button_board[3][3].setText("Done");
    }
}
