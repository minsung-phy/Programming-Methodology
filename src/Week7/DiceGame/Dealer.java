package Week7.DiceGame;

public class Dealer {
    Dice d1 = new Dice();
    Dice d2 = new Dice();

    public void dealDiceGame(Player p1, Player p2, GameBoard b, Registrar r) {
        Player first = p1;
        Player second = p2;

        while (true) {
            // 누적 점수가 작은 플레이어가 먼저 던진다.
            if (p2.points() < p1.points()) {
                first = p2;
                second = p1;
            }

            // 각 플레이어가 주사위를 던진다.
            Dice dice1 = new Dice();
            Dice dice2 = new Dice();

            first.play(dice1);
            second.play(dice2);

            // 승패를 결정한다.
            decideWinner(first, second);

            b.repaint();

            // 게임을 계속할지 여부를 물어본다.
            if (r.wantToContinue() != 0) {
                System.exit(0); // 게임 종료
            }

            // 다음 게임을 위해 승패 기록을 초기화
            p1.reset();
            p2.reset();
        }
    }

    // 승패를 결정하는 메소드
    private void decideWinner(Player p1, Player p2){
        Dice d1 = p1.rolled();
        Dice d2 = p2.rolled();

        // 쌍둥이 확인
        if (d1.twin() && !d2.twin()) {
            p1.receivePoint(); // 쌍둥이가 아닌 주사위를 무조건 이긴다.
        } else if (!d1.twin() && d2.twin()) {
            p2.receivePoint();
        } else if (d1.twin() && d2.twin()) {
            // 둘 다 쌍둥이라면 더 큰 숫자를 가진 사람이 이긴다.
            if (d1.face1() > d2.face1()) {
                p1.receivePoint();
            } else if (d2.face1() > d1.face1()) {
                p2.receivePoint();
            }
        } else {
            // 쌍둥이가 아니면 합이 큰 쪽이 이긴다.
            if (d1.sum() > d2.sum()) {
                p1.receivePoint();
            } else if (d2.sum() > d1.sum()) {
                p2.receivePoint();
            } else {
                // 합이 같으면 차이가 작은 쪽이 이긴다.
                if (d1.difference() < d2.difference()) {
                    p1.receivePoint();
                } else if (d2.difference() < d1.difference()) {
                    p2.receivePoint();
                }
            }
        }
    }
}