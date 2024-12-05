package Final_1st.Ch9.Throb;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ColorButton extends JButton implements ActionListener {
    private ThrobPanel drawing;

    public ColorButton(ThrobPanel f) {
        super("OK");
        drawing = f;
        addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        // ThrobPanel에서 공 색칠하는 함수를 받아서 색을 바꿔야겠네
        if (drawing.getColor() == Color.RED)
            drawing.setColor(Color.BLUE);
        else
            drawing.setColor(Color.RED);
    }

}
