import java.util.Scanner;

public class q116 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter maximum stock items capacity: ");
        int capacity = sc.nextInt();
        sc.nextLine();
        
        String[] itemNames = new String[capacity];
        int[] itemQuantities = new int[capacity];
        int itemCount = 0;
        
        int choice = 0;
        while (choice != 4) {
            System.out.println("\n--- INVENTORY MANAGEMENT SYSTEM ---");
            System.out.println("1. Add New Item Stock");
            System.out.println("2. Update Item Quantity");
            System.out.println("3. Display Current Inventory Report");
            System.out.println("4. Exit");
            System.out.print("Enter operational choice: ");
            choice = sc.nextInt();
            sc.nextLine();
            
            if (choice == 1) {
                if (itemCount < capacity) {
                    System.out.print("Enter Item Name: ");
                    itemNames[itemCount] = sc.nextLine();
                    System.out.print("Enter Initial Quantity: ");
                    itemQuantities[itemCount] = sc.nextInt();
                    itemCount++;
                    System.out.println("Item added to stock registry.");
                } else {
                    System.out.println("Inventory tracking storage limits hit.");
                }
            } else if (choice == 2) {
                System.out.print("Enter Item Name to modify: ");
                String nameQuery = sc.nextLine();
                int foundIndex = -1;
                
                for (int i = 0; i < itemCount; i++) {
                    if (itemNames[i].equalsIgnoreCase(nameQuery)) {
                        foundIndex = i;
                        break;
                    }
                }
                
                if (foundIndex != -1) {
                    System.out.print("Enter new total stock quantity value: ");
                    itemQuantities[foundIndex] = sc.nextInt();
                    System.out.println("Stock updated successfully.");
                } else {
                    System.out.println("Item name match not found.");
                }
            } else if (choice == 3) {
                if (itemCount == 0) {
                    System.out.println("No records found. Inventory completely empty.");
                } else {
                    System.out.println("\nItem Identity Name\t\tStock Quantities On Hand");
                    System.out.println("------------------------------------------------");
                    for (int i = 0; i < itemCount; i++) {
                        System.out.println(itemNames[i] + "\t\t\t" + itemQuantities[i]);
                    }
                }
            } else if (choice == 4) {
                System.out.println("Shutting down inventory system module safely.");
            } else {
                System.out.println("Unknown parameter flag execution entry.");
            }
        }
        sc.close();
    }
}