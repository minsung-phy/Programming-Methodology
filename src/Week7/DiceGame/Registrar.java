package Week7.DiceGame;

import javax.swing.*;

public class Registrar {

    public String invitePlayer() {
        return JOptionPane.showInputDialog("이름을 등록해 주세요.");
    }

    public int wantToContinue() {
        return JOptionPane.showConfirmDialog(null, "더 하시겠어요?");
    }
}
