package Final_2nd.Ch10;

import javax.swing.*;
import java.io.*;

public class File3 { // 직렬 파일에서 읽어오기
    public static void main(String[] args) throws IOException {
        String file_name = JOptionPane.showInputDialog("읽을 파일 이름을 쓰세요.");
        FileReader reader = new FileReader(file_name);
        BufferedReader infile = new BufferedReader(reader);

        FileWriter writer = new FileWriter(file_name + ".out");
        PrintWriter outfile = new PrintWriter(writer);

        while (infile.ready()) { // ready() : 입력 스트림에서 읽을 데이터가 준비되었는지 확인
                String s = infile.readLine();
                outfile.print(s + " ");
        }
        outfile.close();
        infile.close();
    }
}
