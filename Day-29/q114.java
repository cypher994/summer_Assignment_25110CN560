import java.util.Scanner;

public class q114 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter maximum capacity of the array: ");
        int capacity = sc.nextInt();
        int[] arr = new int[capacity];
        int size = 0;
        
        int choice = 0;
        while (choice != 5) {
            System.out.println("\n--- ARRAY OPERATIONS MENU ---");
            System.out.println("1. Insert Element");
            System.out.println("2. Delete Element by Position");
            System.out.println("3. Display Array");
            System.out.println("4. Search Element");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            
            if (choice == 1) {
                if (size < capacity) {
                    System.out.print("Enter element to insert: ");
                    arr[size] = sc.nextInt();
                    size++;
                    System.out.println("Element inserted successfully.");
                } else {
                    System.out.println("Array is full. Cannot insert.");
                }
            } else if (choice == 2) {
                if (size == 0) {
                    System.out.println("Array is empty. Nothing to delete.");
                } else {
                    System.out.print("Enter index position to delete (0 to " + (size - 1) + "): ");
                    int pos = sc.nextInt();
                    if (pos >= 0 && pos < size) {
                        for (int i = pos; i < size - 1; i++) {
                            arr[i] = arr[i + 1];
                        }
                        size--;
                        System.out.println("Element deleted successfully.");
                    } else {
                        System.out.println("Invalid position.");
                    }
                }
            } else if (choice == 3) {
                if (size == 0) {
                    System.out.println("Array is empty.");
                } else {
                    System.out.print("Array elements: ");
                    for (int i = 0; i < size; i++) {
                        System.out.print(arr[i] + " ");
                    }
                    System.out.println();
                }
            } else if (choice == 4) {
                System.out.print("Enter element to search: ");
                int target = sc.nextInt();
                int foundIdx = -1;
                for (int i = 0; i < size; i++) {
                    if (arr[i] == target) {
                        foundIdx = i;
                        break;
                    }
                }
                if (foundIdx != -1) {
                    System.out.println("Element found at index: " + foundIdx);
                } else {
                    System.out.println("Element not found in the array.");
                }
            } else if (choice == 5) {
                System.out.println("Exiting Array Operations System.");
            } else {
                System.out.println("Invalid option.");
            }
        }
        sc.close();
    }
}