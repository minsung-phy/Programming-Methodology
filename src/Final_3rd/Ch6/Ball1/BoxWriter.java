package Final_3rd.Ch6.Ball1;

import java.awt.*;

public class BoxWriter { // BoxWriter : 상자를 그림
    private Box box; // 상자 객체

    /** Constructor BoxWriter 상자를 그림
     * @param b 상자 객체 */
    public BoxWriter(Box b) {
        box = b;
    }

    /** paintComponent 상자 그리기
     * @param g 그래픽스 펜 */
    public void paintComponent(Graphics g) {
        int size = box.sizeOf();
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, size, size);
        g.setColor(Color.BLACK);
        g.drawRect(0 , 0, size, size);
    }
}
