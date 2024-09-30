package Week4.HelloWorld;

public class Controller {
    void control(Model m, View v) { // Model m, View v를 통해 Model, View를 상속 받은 것임.
        // v.show(m.createGreetings());
        v.showSwing(m.createGreetings());
    }
}
