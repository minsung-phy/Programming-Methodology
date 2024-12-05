package Final_1st.Ch7.PuzzleGame;

public class PuzzleStarter {
    public static void main(String[] args) {
        SlidePuzzleBoard board = new SlidePuzzleBoard();
        PuzzleWriter writer = new PuzzleWriter(board);
        new PuzzleController(board, writer).play();
    }
}
