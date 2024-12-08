package Final_3rd.Ch10.PuzzleGameGUI2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PuzzleButton extends JButton implements ActionListener {
    private SlidePuzzleBoard board;
    private PuzzleFrame frame;

    public PuzzleButton(SlidePuzzleBoard b, PuzzleFrame f) {
        board = b;
        frame = f;
        addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        String s = getText();
        if (!s.equals("") && board.move(Integer.parseInt(s))) {
            frame.update();
            if (board.gameOver())
                frame.finish();
        }
    }
}
