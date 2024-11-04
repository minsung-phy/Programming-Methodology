package Week10.PuzzleGame;

import javax.swing.*;

public class PuzzleController {
    SlidePuzzleBoard board;
    PuzzleWriter writer;
    public PuzzleController(SlidePuzzleBoard board, PuzzleWriter writer) {
        this.board = board;
        this.writer = writer;
    }

    public void play() {
        while (true) {
            writer.displayPuzzle();

            String input = JOptionPane.showInputDialog("움직일 퍼즐 조각 번호를 선택하세요.");

            if (input == null) {
                break; // 사용자가 입력을 취소하면 게임 종료
            }

            int value = Integer.parseInt(input);
            if (!board.move(value)) {
                JOptionPane.showMessageDialog(null, "움직일 수 없습니다.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}
