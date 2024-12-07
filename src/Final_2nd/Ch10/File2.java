package Final_2nd.Ch10;

import java.io.FileWriter;
import java.io.PrintWriter;

public class File2 { // 직렬 파일에 이어 쓰기
    public static void main(String[] args) throws Exception {
        // 이어 쓸 용도로 파일 열기
        FileWriter writer = new FileWriter("poem.txt", true);
        PrintWriter outfile = new PrintWriter(writer);
        outfile.println("방학이 되면...");
        outfile.println("뭘 할까?");
        outfile.close(); // 파일 닫기
    }
}
