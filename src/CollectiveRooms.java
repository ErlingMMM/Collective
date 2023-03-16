import java.time.LocalDate;
import java.util.HashMap;


public class CollectiveRooms extends HashMap<Integer, Room> {

    public CollectiveRooms() {
        Room newRoom = new Room();
        newRoom.setRoomNumber(101);
        newRoom.setTenant(new Person("Erling", 33, "erlingPOST"));
        LocalDate startDate = LocalDate.of(2023, 3, 1);
        LocalDate endDate = LocalDate.of(2024, 2, 29);
        newRoom.setRentalAgreement(new RentalAgreement(startDate, endDate));
        this.put(newRoom.getRoomNumber(), newRoom);

        Room newRoom2 = new Room();
        newRoom2.setRoomNumber(102);
        newRoom2.setTenant(new Person("Erling3", 33, "erlingPOST"));
        LocalDate startDate2 = LocalDate.of(2023, 3, 1);
        LocalDate endDate2 = LocalDate.of(2025, 2, 26);
        newRoom2.setRentalAgreement(new RentalAgreement(startDate2, endDate2));
        this.put(newRoom2.getRoomNumber(), newRoom2);

        Room newRoom3 = new Room();
        newRoom3.setRoomNumber(103);
        this.put(newRoom3.getRoomNumber(), newRoom3);
    }
}

