package Final_1st.Ch9.Counter_Border;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CounterButton extends JButton implements ActionListener {
    private CounterFrame view;
    private Counter model;

    public CounterButton(String label, Counter m, CounterFrame v) {
        super(label); // JButton button = new JButton("OK"); cp.add(button);
        view = v;
        model = m;
        addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        model.increment();
        view.update();
    }

}
