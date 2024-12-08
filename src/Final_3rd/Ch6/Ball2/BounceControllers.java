package Final_3rd.Ch6.Ball2;

public class BounceControllers { // 상자 안에서 움직이는 공 제어
    private MovingBall ball1; // 공 객체
    private MovingBall ball2; // 공 객체
    private AnimationWriters writer; // 애니메이션 객체 (Output-View)


    /** Constructor BounceController 컨트롤러 초기화
     * @param b1, b2 공 객체 (Model)
     * @param w 애니메이션 객체 (Output-View) */
     public BounceControllers(MovingBall b1, MovingBall b2, AnimationWriters w) {
         ball1 = b1;
         ball2 = b2;
         writer = w;
     }

    /** runAnimation 내부 시계를 활용하여 애니메이션 구동 */
    public void runAnimation() {
        int time_unit = 1; // 애니메이션 스텝의 시간 단위
        int painting_delay = 20; // 다시 그리기 사이의 지연 시간 간격
        while (true) {
            delay(painting_delay);
            ball1.move(time_unit);
            ball2.move(time_unit);
            double del_x = Math.pow(ball1.xPosition(), 2) - Math.pow(ball2.xPosition(), 2);
            double del_y = Math.pow(ball1.yPosition(), 2) - Math.pow(ball2.yPosition(), 2);
            double d = Math.sqrt(del_x + del_y);
            int min_r = Math.min(ball1.radiusOf(), ball2.radiusOf());
            // 충돌이 발생하면 메세지 후 종료
            if (d <= min_r) {
                System.out.println("충돌하였습니다.");
                System.exit(1);
            }
            writer.repaint();
        }
    }

    /** delay how_long millisecond 동안 실행 정지 */
    private void delay(int how_long) {
        try {
            Thread.sleep(how_long);
        } catch (InterruptedException e) { }
    }

}
