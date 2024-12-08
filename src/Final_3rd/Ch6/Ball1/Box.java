package Final_3rd.Ch6.Ball1;

public class Box { // BOX : 공이 돌아다니는 상자
    private int BOX_SIZE; // 상자의 크기

    /** Constructor Box 상자 생성
     * @param size 상자의 크기 */
    public Box(int size) {
        BOX_SIZE = size;
    }

    /** inHorizontalContact : 공이 x축 방향으로 좌/우 벽에 도달 려부를 리턴
     * @param x_position 공의 x 좌표
     * @return 공의 x 좌표가 좌우 벽의 x 좌표와 같거나 벗어났으면 true, 그렇지 않으면 false
     */
    public boolean inHorizontalContact(int x_position) {
        return (x_position <= 0 || x_position >= BOX_SIZE);
    }

    /** inVerticalContact : 공이 y축 방향으로 상/하 벽에 도달 려부를 리턴
     * @param y_position 공의 y 좌표
     * @return 공의 y 좌표가 상하 벽의 y 좌표와 같거나 벗어났으면 true, 그렇지 않으면 false
     */
    public boolean inVerticalContact(int y_position) {
        return (y_position <= 0 || y_position >= BOX_SIZE);
    }

    /** sizeOf : 상자의 크기 리턴 */
    public int sizeOf() {
        return BOX_SIZE;
    }
}
