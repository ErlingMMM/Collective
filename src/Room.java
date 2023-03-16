//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class Room {
    private int roomNumber;
    private Person tenant;
    private RentalAgreement rentalAgreement;

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Person getTenant() {
        return tenant;
    }

    public void setTenant(Person tenant) {
        this.tenant = tenant;
    }

    public RentalAgreement getRentalAgreement() {
        return rentalAgreement;
    }

    public void setRentalAgreement(RentalAgreement rentalAgreement) {
        this.rentalAgreement = rentalAgreement;
    }

    @Override
    public String toString() {
        return "Room{" +
                "roomNumber=" + roomNumber +
                ", tenant=" + tenant +
                ", rentalAgreement=" + rentalAgreement +
                '}' +
                "\n -----------------------------------------------------------  \n";
    }

    public Room(int roomNumber, Person tenant, RentalAgreement rentalAgreement) {
        this.roomNumber = roomNumber;
        this.tenant = tenant;
        this.rentalAgreement = rentalAgreement;
    }

    public Room() {
    }
}
