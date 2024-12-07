package Final_2nd.Ch9.Counter_Border;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CounterController implements ActionListener {
    private CounterFrame view;
    private Counter model;

    public CounterController (Counter m, CounterFrame v) {
        model = m;
        view = v;
    }
    public void actionPerformed(ActionEvent e) {
        model.increment();
        view.update();
    }
}
