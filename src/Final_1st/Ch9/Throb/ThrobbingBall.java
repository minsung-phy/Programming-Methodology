package Final_1st.Ch9.Throb;

public class ThrobbingBall {
    private boolean is_large;

    public boolean isLarge() {
        return is_large;
    }

    public void throb() {
        is_large = !is_large;
    }

}
