package Week4.Clock;

public class Controller {
    void control(Model m, View v) {
        // v.show(m.whatTimeIsIt());
        v.showSwing(m.whatTimeIsIt());
    }
}
