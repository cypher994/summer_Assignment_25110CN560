import java.util.Scanner;

public class q111 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter total stadium/theater seats count layout: ");
        int maxSeats = sc.nextInt();
        
        int[] seatMap = new int[maxSeats]; 
        
        int choice = 0;
        while (choice != 3) {
            System.out.println("\n--- AUDITORIUM TICKET MANAGEMENT RESERVATIONS ---");
            System.out.println("1. View Virtual Seating Configuration Map");
            System.out.println("2. Reserve Seat Allocation Token");
            System.out.println("3. Terminate Connection Console");
            System.out.print("Input request index: ");
            choice = sc.nextInt();
            
            if (choice == 1) {
                System.out.println("\n--- SEAT AVAILABILITY MATRIX ---");
                for (int i = 0; i < maxSeats; i++) {
                    String marker = (seatMap[i] == 1) ? "[X]" : "[" + (i + 1) + "]";
                    System.out.print(marker + " ");
                    if ((i + 1) % 5 == 0) System.out.println();
                }
                System.out.println();
            } else if (choice == 2) {
                System.out.print("Select target seat row reference integer position (1-" + maxSeats + "): ");
                int targetedSeatNum = sc.nextInt();
                
                if (targetedSeatNum >= 1 && targetedSeatNum <= maxSeats) {
                    int finalIdx = targetedSeatNum - 1;
                    if (seatMap[finalIdx] == 0) {
                        seatMap[finalIdx] = 1;
                        System.out.println("Seat structural placeholder bound to booking identity successfully.");
                    } else {
                        System.out.println("Conflict Warning: Destination node already locked down.");
                    }
                } else {
                    System.out.println("Out of Bounds Exception: Selected address path non-existent.");
                }
            } else if (choice == 3) {
                System.out.println("Killing engine execution loop frames safely.");
            } else {
                System.out.println("Fault verification loop caught unknown directive code parameters.");
            }
        }
        sc.close();
    }
}