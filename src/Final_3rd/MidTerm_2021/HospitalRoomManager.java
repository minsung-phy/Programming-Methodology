package Final_3rd.MidTerm_2021;

public class HospitalRoomManager {
    public static void main(String[] args) {
        Hospital h = new Hospital(4);
        new HospitalController(h, new Displayer(h), new Reader()).manageRooms();
    }
}