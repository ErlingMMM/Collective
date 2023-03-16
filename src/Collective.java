import java.util.*;

import static java.lang.System.out;


public class Collective {
    private static CollectiveRooms rooms;

    public Collective() {
        rooms = new CollectiveRooms();
    }

    public static void filterByRoomNumber() {
        boolean isFiltered = false;
        Scanner scan = new Scanner(System.in);
        int userInput = 0;
        List<Integer> roomNumbers = new ArrayList<>();
        for (Map.Entry<Integer, Room> entry : rooms.entrySet()) {
            roomNumbers.add(entry.getValue().getRoomNumber());
        }
        out.println("Tilgjengelige romnumre: " + roomNumbers);
        while (!isFiltered) {
            out.println("Filter et romnummer:");
            if (scan.hasNextInt()) {
                userInput = scan.nextInt();

                if (roomNumbers.contains(userInput)) {
                    out.println("Room " + rooms.get(userInput).toString());
                    isFiltered = true;
                    break; // exit the loop once a matching room is found
                } else {
                    out.println("Romnummeret finnes ikke. Prøv igjen.");
                }
            } else {
                out.println("Input must be an integer. Please try again.");
                scan.next();   // consume the invalid input

            }
        }
    }

    public static void printRooms(boolean onlyEmpty) {
        for (Map.Entry<Integer, Room> entry : rooms.entrySet()) {
            Room room = entry.getValue();
            Person tenant = room.getTenant();

            if (onlyEmpty && tenant != null) {
                continue;
            }
            if (!onlyEmpty && tenant == null) {
                continue;
            }
            out.println(room.toString());
        }
    }

    public void printNumberOfRooms() {
        out.println("Antall rom: " + rooms.size());
    }
}

