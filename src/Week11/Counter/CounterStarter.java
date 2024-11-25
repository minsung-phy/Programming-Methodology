package Week11.Counter;

import javax.swing.*;

public class CounterStarter {
    public static void main(String[] args) {
        Counter model = new Counter(0);
        JPanel drawingPanel = new JPanel(); // JPanel 생성
        CounterFrame view = new CounterFrame(model, drawingPanel);
    }
}
