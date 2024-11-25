package Week11.Ball;

public class ThrobbingBall {
    private boolean isLarge = false;

    public boolean isLarge() {
        return isLarge;
    }

    public void throb() {
        isLarge = !isLarge;
    }
}
