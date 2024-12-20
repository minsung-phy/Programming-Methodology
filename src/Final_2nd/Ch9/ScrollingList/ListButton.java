package Final_2nd.Ch9.ScrollingList;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ListButton extends JButton implements ActionListener {
    private Counter2[] counters;
    private ListFrame view;

    public ListButton(String label, Counter2[] c, ListFrame v) {
        super(label);
        counters = c;
        view = v;
        addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        int choice = view.getSelection();
        if (choice != -1) {
            counters[choice].increment();
            view.update();
        }
    }
}
