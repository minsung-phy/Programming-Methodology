package Final_1st.Ch9.Counter_Border;

import javax.swing.*;

public class CounterStarter {
    public static void main(String[] args) {
        Counter model = new Counter(0);
        JPanel drawingPanel = new Drawing(model);
        CounterFrame view = new CounterFrame(model, drawingPanel);
    }
}
