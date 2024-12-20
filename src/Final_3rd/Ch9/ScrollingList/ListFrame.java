package Final_3rd.Ch9.ScrollingList;

import javax.swing.*;
import java.awt.*;

public class ListFrame extends JFrame {
    private Counter2[] counters;
    private JList items;

    public ListFrame(Counter2[] model) {
        counters = model;
        items = new JList(counters);
        JScrollPane sp = new JScrollPane(items);

        Container cp = getContentPane();
        cp.setLayout(new GridLayout(2, 1));
        cp.add(sp);

        JPanel p = new JPanel(new GridLayout(2,1));
        p.add(new ListButton("Go", counters, this));
        p.add(new ExitButton("Quit"));
        cp.add(p);

        update();

        setTitle("List Example");
        setSize(200, 200);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public int getSelection() {
        return items.getSelectedIndex();
    }

    public void update() {
        items.clearSelection(); // JList의 선택을 지움
    }

}
