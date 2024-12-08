package Final_2nd.MidTerm_2021_Sol;

public class HospitalRoomManager {
    public static void main(String[] args) {
        Hospital h = new Hospital(4);
        new HospitalController(h, new Displayer(h), new Reader()).manageRooms();
    }
}