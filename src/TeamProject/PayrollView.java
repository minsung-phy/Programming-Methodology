package TeamProject;

import javax.swing.*;

public class PayrollView {
    public String input_name() {
        String name_in;
        do {
            name_in = JOptionPane.showInputDialog("입력 파일명을 입력하세요:");
            if (name_in == null || name_in.trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "입력 파일명을 입력해야 합니다.");
            }
        } while (name_in == null || name_in.trim().isEmpty());
        return name_in.trim();
    }

    public String output_name() {
        String name_out;
        do {
            name_out = JOptionPane.showInputDialog("출력 파일명을 입력하세요:");
            if (name_out == null || name_out.trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "출력 파일명을 입력해야 합니다.");
            }
        } while (name_out == null || name_out.trim().isEmpty());
        return name_out.trim();
    }
}
