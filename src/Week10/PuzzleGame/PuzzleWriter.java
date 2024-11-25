package Week10.PuzzleGame;

import javax.swing.*;
import java.awt.*;

public class PuzzleWriter extends JPanel {
    SlidePuzzleBoard board; // 보드 객체
    final int SIZE = 400;
    int empty_row;
    int empty_col;

    public PuzzleWriter(SlidePuzzleBoard b) {
        board = b;
        JFrame f = new JFrame();
        f.setTitle("PuzzleGame");
        f.setSize(SIZE + 50, SIZE + 75);
        f.getContentPane().add(this);
        f.setVisible(true);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    // 퍼즐 보드를 다시 그리는 메소드
    public void displayPuzzle() {
        repaint();
    }

    public void paintComponent(Graphics g) {
        int size = SIZE;
        g.setColor(Color.yellow);
        g.fillRect(0, 0, size + 50, size + 50);
        paintBoard(4, 4, size, g); // 퍼즐 보드 그리기
    }

    public void paintBoard(int rows, int cols, int size, Graphics g) {
        g.setColor(Color.white);
        g.fillRect(25, 25, size, size);

        PuzzlePiece[][] contents = board.contents();

        int pieceRowSize = size / rows;
        int pieceColSize = size / cols;

        for (int row = 0; row < rows; row++) {
            int xPosition = 25 + row * pieceRowSize;
            for (int col = 0; col < cols; col++) {
                int yPosition = 25 + col * pieceColSize;

                PuzzlePiece piece = contents[row][col];

                // 빈 조각일 경우 검정색으로 설정
                if (piece == null) {
                    g.setColor(Color.BLACK);
                    g.fillRect(xPosition, yPosition, pieceRowSize, pieceColSize);
                } else {
                    g.setColor(Color.BLACK); // 퍼즐 조각은 흰색으로 설정
                    g.drawRect(xPosition, yPosition, pieceRowSize, pieceColSize);
                }

                if (piece != null) {
                    g.setColor(Color.BLACK);

                    // 텍스트의 x, y 좌표 설정
                    int textX = xPosition + pieceColSize / 2 - 5; // 중앙으로 이동
                    int textY = yPosition + pieceRowSize / 2 + 5; // 중앙으로 이동

                    g.drawString(String.valueOf(piece.faceValue()), textX, textY);
                }
            }
        }
    }
}
