//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.*;

import static java.lang.System.*;

public class Terminal {
    static Collective collective = new Collective();

    public Terminal() {
    }


    public static void mainMenu() {

        Scanner scanner = new Scanner(in);
        String menuString = "";

        while (!menuString.equalsIgnoreCase("q")) {
            out.println("1. Print ut antall rom \n" + "2. Print ut tomme rom \n" + "3. Print ut bebodde rom \n" + "4. Filter etter romnummer \n"
                    + "5. Filter etter utflyttings år \n" + "Q. Quit \n");

            menuString = scanner.nextLine();
            switch (menuString.toLowerCase()) {
                case "1" -> collective.printNumberOfRooms();
                case "2" -> Collective.printRooms(true);
                case "3" -> Collective.printRooms(false);
                case "4" -> Collective.filterByRoomNumber();
                //  case "5" -> filterByAgreementYear();
                case "q" -> out.println("Goodbye");
                default -> out.println("You wrote something wrong. \nTry again.\n\n");
            }
        }

    }
}




/*  private static void filterByAgreementYear() {
        boolean isFiltered = false;
        int userInput = 0;
        Scanner scan = new Scanner(System.in);
        List<Integer> agreementYear = new ArrayList<>();
        for (Map.Entry<Integer, Room> entry : rooms.entrySet()) {
            Room room = entry.getValue();
            Person tenant = room.getTenant();

            if ( tenant != null) {
                agreementYear.add(entry.getValue().getRentalAgreement().getMoveOutDate().getYear());
            }
        }
        System.out.println("Tilgjengelige år: " + agreementYear);
        while (!isFiltered) {
            System.out.println("Filter etter år:");
            if (scan.hasNextInt()) {
                userInput = scan.nextInt();

                if (agreementYear.contains(userInput)) {
                    System.out.println("Room " + rooms.get(userInput).toString());
                    isFiltered = true;
                } else {
                    System.out.println("Året finnes ikke. Prøv igjen.");
                }
            } else {
                System.out.println("Input must be an integer. Please try again.");
                scan.next();   // consume the invalid input

            }
        }
    }*/
