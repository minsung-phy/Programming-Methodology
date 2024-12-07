package Final_2nd.Ch9.Counter_Border;

public class CounterStarter {
    public static void main(String[] args) {
        Counter model = new Counter(0);
        Drawing drawingPanel = new Drawing(model);
        CounterFrame view = new CounterFrame(model, drawingPanel);
    }
}
