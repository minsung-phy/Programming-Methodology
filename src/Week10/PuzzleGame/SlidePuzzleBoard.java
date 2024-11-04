package Week10.PuzzleGame;

public class SlidePuzzleBoard {
    PuzzlePiece[][] board;
    int empty_row;
    int empty_col;
    int row = 4;
    int col = 4;

    public SlidePuzzleBoard() {
        board = new PuzzlePiece[row][col];
        int number = 1;

        for (int i = row-1; i >= 0; i--) {
            for (int j = col-1; j >= 0; j--) {
                if (i == 0 && j == 0) {
                    // 첫 셀을 빈칸으로 설정
                    board[i][j] = null;
                    empty_row = i;
                    empty_col = j;
                } else {
                    board[i][j] = new PuzzlePiece(number);
                    number++;
                }
            }
        }
    }

    public PuzzlePiece[][] contents() {
        return board;
    }

    public boolean move(int w) {
        if (found(w, empty_row - 1, empty_col) ||
            found(w, empty_row, empty_col - 1) ||
            found(w, empty_row + 1, empty_col) ||
            found(w, empty_row, empty_col + 1)) {

            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    if (board[i][j] != null && board[i][j].faceValue() == w) {
                        board[empty_row][empty_col] = board[i][j];
                        board[i][j] = null;
                        empty_row = i;
                        empty_col = j;
                        return true;
                    }
                }
            }

            return true;
        }
        return false;
    }

    public boolean found(int v, int row, int col) {
        // 유효한 인덱스인지 확인
        if (row < 0 || row >= board.length || col < 0 || col >= board[0].length) {
            return false; // 범위를 벗어난 경우
        }

        // 값 비교
        PuzzlePiece[][] now_board = contents();
        if (now_board[row][col].faceValue() == v)
            return true;
        return false;
    }
}
