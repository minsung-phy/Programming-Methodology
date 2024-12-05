package Final_1st.Ch9.PuzzleGameGUI;

import javax.swing.*;
import java.awt.*;

public class PuzzleFrame extends JFrame {
    private SlidePuzzleBoard board;
    private PuzzleButton[][] button_board;

    public PuzzleFrame(SlidePuzzleBoard b) {
        board = b;
        button_board = new PuzzleButton[4][4];
        Container cp = getContentPane();
        cp.setLayout(new GridLayout(4, 4));
        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 4; col++) {
                button_board[row][col] = new PuzzleButton(board, this);
                cp.add(button_board[row][col]); // 버튼 객체를 Container cp에 추가
            }
        }
        update();
        setTitle("Slide Puzzle");
        setSize(250, 250);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    // 퍼즐 게임 보드의 현재 상태를 UI 버튼 배열에 반영하는 갱신 함수
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
}
