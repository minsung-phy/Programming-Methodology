package Final_2nd.MidTerm_2021;

public class Hospital {
    private Patient[] rooms; // 입원실 배열
    private int occupied; // 환자가 입실중인 입원실의 개수

    public Hospital(int n) { // 병원 객체 생성 초기화 메소드, n = 병원이 보유한 입원실의 개수
        rooms = new Patient[n];
        occupied = 0;
    }

    /**
     * 입원실 배열을 리턴한다.
     * @return
     */
    public Patient[] getRoomsInfo() {
        return rooms;
    }

    /** [1번 - 배점 2점]
     * 비어있는 입원실이 있는지 여부를 리턴한다.
     * @return
     */
    public boolean roomAvailable() {
        return occupied < rooms.length;
    }

    /** [2번 - 배점 5점]
     * 환자 등록번호 id로 입원 중인 환자를 찾는다.
     * @param id
     * @return 환자
     */
    public Patient findPatient(int id) {
        for (int i = 0; i < occupied; i++) {
            Patient p = rooms[i];
            if (p.getID() == id)
                return p;
        }
        return null;
    }

    /** [3번 - 배점 5점]
     * 환자 p를 입실시킨다.
     * @param p
     * @return 빈 입원실이 있어서 입실 성공하면 true, 없어서 실패하면 false
     */
    public boolean admit(Patient p) {
        if (roomAvailable()) {
            rooms[occupied] = p;
            occupied++;
            return true;
        }
        else
            return false;
    }

    /** [4번 - 배점 5점]
     * 환자 p를 퇴실시킨다.
     * @param p
     * @return 환자를 찾아서 퇴실 성공하면 true, 실패하면 false
     */
    public boolean discharge(Patient p) {
        Patient dis_p = findPatient(p.getID());
        // int dis_o = 0;
        if (dis_p != null) {
            for (int i = 0; i < occupied; i++) {
                if (rooms[i].getID() == dis_p.getID()) {
                    // dis_o = i;
                    rooms[i] = null;
                }

            }
            /*
            if (dis_o == occupied - 1) {
                rooms[occupied - 1] = null;
                occupied -= 1;
            }
            else if (dis_o < occupied - 1) {
                for (int i = dis_o; i < occupied - 1; i++) {
                    rooms[i] = rooms[i+1];
                }
                rooms[occupied - 1] = null;
                occupied -= 1;
            }
             */
            return true;
        }
        return false;
    }
}