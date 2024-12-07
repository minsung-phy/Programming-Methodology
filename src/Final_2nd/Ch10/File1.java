package Final_2nd.Ch10;

import java.io.FileWriter;
import java.io.PrintWriter;

public class File1 { // 직렬 파일에 쓰기
    public static void main(String[] args) throws Exception {
        // 쓸 용도로 파일 만들고 열기
        FileWriter writer = new FileWriter("poem.txt");
        PrintWriter outfile = new PrintWriter(writer);
        outfile.println("가을이 오면...");
        outfile.println("학기가 저물고,");
        outfile.println("시험이 끝나면서");
        outfile.println("겨울이 온다.");
        outfile.close();
    }
}
