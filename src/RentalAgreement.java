//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.time.LocalDate;

public class RentalAgreement {
    private LocalDate moveInDate;
    private LocalDate moveOutDate;


    public LocalDate getMoveInDate() {
        return moveInDate;
    }

    public void setMoveInDate(LocalDate moveInDate) {
        this.moveInDate = moveInDate;
    }

    public LocalDate getMoveOutDate() {
        return moveOutDate;
    }

    public void setMoveOutDate(LocalDate moveOutDate) {
        this.moveOutDate = moveOutDate;
    }


    @Override
    public String toString() {
        return "RentalAgreement{" +
                "moveInDate=" + moveInDate +
                ", moveOutDate=" + moveOutDate +
                '}';
    }

    public RentalAgreement(LocalDate moveInDate, LocalDate moveOutDate) {
        this.moveInDate = moveInDate;
        this.moveOutDate = moveOutDate;

    }


}
