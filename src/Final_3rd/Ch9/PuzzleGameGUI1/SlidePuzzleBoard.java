package Final_3rd.Ch9.PuzzleGameGUI1;

public class SlidePuzzleBoard {
    private PuzzlePiece[][] board;
    // 빈칸의 좌표
    private int empty_row;
    private int empty_col;

    public SlidePuzzleBoard() {
        int number = 1;
        board = new PuzzlePiece[4][4];
        for (int i = 4; i > 0; i--) {
            for (int j = 4; j > 0; j--) {
                board[i-1][j-1] = new PuzzlePiece(number - 1);
                number++;
            }
        }
        empty_row = 3;
        empty_col = 3;
        board[empty_row][empty_col] = null;
    }

    /** getPuzzlePiece 퍼즐 조각을 리턴
     * @param row 가로줄 인덱스
     * @param col 세로줄 인덱스
     * @return 퍼즐 조각
     */
    public PuzzlePiece getPuzzlePiece(int row, int col) {
        return board[row][col];
    }

    /** move 이동이 가능하면, 퍼즐 조각을 빈칸으로 이동
     * @param w 이동하기 원하는 퍼즐 조각의 번호
     * @return 이동 성공하면 true를 리턴하고, 이동이 불가능하면 false를 리턴
     */
    public boolean move(int w) {
        int row, col;
        if (found(w, empty_row - 1, empty_col)) {
            row = empty_row - 1;
            col = empty_col;
        }
        else if (found(w, empty_row + 1, empty_col)) {
            row = empty_row + 1;
            col = empty_col;
        }
        else if (found(w, empty_row, empty_col - 1)) {
            row = empty_row;
            col = empty_col - 1;
        }
        else if (found(w, empty_row, empty_col + 1)) {
            row = empty_row;
            col = empty_col + 1;
        }
        else {
            return false;
        }
        board[empty_row][empty_col] = board[row][col];
        empty_row = row;
        empty_col = col;
        board[empty_row][empty_col] = null;
        return true;
    }

    /** found board[row][col]에 퍼즐 조각 v가 있는지 확인 */
    public boolean found(int v, int row, int col) {
        if (row >= 0 && row <= 3 && col >= 0 && col <= 3)
            return board[row][col].face() == v;
        else
            return false;
    }
}