import java.util.Scanner;

public class q120 {
    public static void displayMenu() {
        System.out.println("\n=== INVENTORY MANAGEMENT ===");
        System.out.println("1. Add Product");
        System.out.println("2. Display Inventory");
        System.out.println("3. Exit");
        System.out.print("Select an option: ");
    }

    public static int addProduct(String[] items, double[] prices, int currentCount, int maxCapacity, Scanner sc) {
        if (currentCount >= maxCapacity) {
            System.out.println("Storage space full.");
            return currentCount;
        }
        System.out.print("Enter product name: ");
        items[currentCount] = sc.nextLine();
        System.out.print("Enter product price: ");
        prices[currentCount] = sc.nextDouble();
        sc.nextLine();
        System.out.println("Product added successfully.");
        return currentCount + 1;
    }

    public static void printInventory(String[] items, double[] prices, int currentCount) {
        if (currentCount == 0) {
            System.out.println("No items stored.");
            return;
        }
        System.out.println("\n--- Current Stock ---");
        for (int i = 0; i < currentCount; i++) {
            System.out.println(items[i] + " : $" + prices[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Set storage item limit: ");
        int capacity = sc.nextInt();
        sc.nextLine();
        
        String[] items = new String[capacity];
        double[] prices = new double[capacity];
        int count = 0;
        
        int choice = 0;
        while (choice != 3) {
            displayMenu();
            choice = sc.nextInt();
            sc.nextLine();
            
            if (choice == 1) {
                count = addProduct(items, prices, count, capacity, sc);
            } else if (choice == 2) {
                printInventory(items, prices, count);
            } else if (choice == 3) {
                System.out.println("Terminating Application System.");
            } else {
                System.out.println("Invalid operational code option.");
            }
        }
        sc.close();
    }
}