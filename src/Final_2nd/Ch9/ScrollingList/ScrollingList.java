package Final_2nd.Ch9.ScrollingList;

public class ScrollingList {
    public static void main(String[] args) {
        int how_many_counters = 8;
        Counter2[] counters = new Counter2[how_many_counters];
        for (int i = 0; i < how_many_counters; i++)
            counters[i] = new Counter2(0, i);
        new ListFrame(counters);
    }
}
