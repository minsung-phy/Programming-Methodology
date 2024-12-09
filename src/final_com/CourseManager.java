import java.io.BufferedReader;
import java.util.StringTokenizer;
import java.lang.String.*;

public class CourseManager {
    private Course course;
    private Student[] students;
    private int[] scores;

    public CourseManager(Course c, Student[] s) {
        course = c;
        students = s;
        scores = new int[course.getCurrentStudents()];
    }

    public void controllerWithReader(java.io.Reader reader) {
        BufferedReader keyboard = new BufferedReader(reader);
        while (true) {
            try {
                System.out.println("name,score 순서대로 입력하세요.");
                String s = keyboard.readLine();
                StringTokenizer tokenizer = new StringTokenizer(s, ",|");
                String name = tokenizer.nextToken();

                // Q 혹은 q를 입력했을 때 입력을 마쳐야 함 (break 로 탈출)
                if (name.equals("Q") || name.equals("q")) {
                    break;
                }

                // course의 students 배열에 없는 이름의 학생을 입력받은 경우에는 적절한 오류 메시지(‘unknown student’ 정도?)를 출력, 점수는 반영하지 않음



                int score = Integer.parseInt(tokenizer.nextToken().trim()); // 0에서 100 사이의 정수
                if (score < 0 || score > 100) {
                    System.out.println("점수는 0에서 100 사이의 정수여야 합니다.");
                    throw new RuntimeException();
                }

                for (int i = 0; i < course.getCurrentStudents(); i++) { // 학생의 이름을 찾아서 점수를 저장
                    if (students[i].getName().equals(name)) {
                        scores[i] = score;
                    }
                }
            } catch (Exception e) { // 예외처리 제대로 해야함
                // ERROR!
            }
        }
    }

    public void printScores() { // 학생의 점수 정보를 출력 : 각 학생의 점수 정보를 내림차순으로 출력해야 함

    }
}
