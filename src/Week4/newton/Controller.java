package Week4.newton;

public class Controller {
    void control(Model m, View v) {
        double mass = v.getM();
        double a = v.getA();
        double f = m.matof(mass, a);
        v.showSwing(f);
    }
}
