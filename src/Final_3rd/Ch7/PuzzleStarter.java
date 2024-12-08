package Final_3rd.Ch7;

public class PuzzleStarter {
    public static void main(String[] args) {
        SlidePuzzleBoard board = new SlidePuzzleBoard();
        PuzzleWriter writer = new PuzzleWriter(board);
        new PuzzleController(board, writer).play();
    }
}
