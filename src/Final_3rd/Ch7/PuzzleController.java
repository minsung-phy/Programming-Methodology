package Final_3rd.Ch7;

import javax.swing.*;

public class PuzzleController {
    private SlidePuzzleBoard board;
    private PuzzleWriter writer;

    public PuzzleController(SlidePuzzleBoard b, PuzzleWriter w) {
        board = b;
        writer = w;
    }

    void play() {
        while (true) {
            writer.displayPuzzle();
            String input = JOptionPane.showInputDialog("움직일 퍼즐 조각 번호를 입력하세요.");
            int w = Integer.parseInt(input);
            if (!board.move(w)) {
                writer.printError("움직일 수 없습니다.");
            }
        }
    }
}
