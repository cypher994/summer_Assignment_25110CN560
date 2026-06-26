import java.util.Scanner;

public class q109 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter max books inventory capacity: ");
        int capacity = sc.nextInt();
        sc.nextLine();
        
        String[] titles = new String[capacity];
        String[] authors = new String[capacity];
        int[] isIssued = new int[capacity]; 
        int bookCount = 0;
        
        int choice = 0;
        while (choice != 4) {
            System.out.println("\n--- LIBRARY MANAGEMENT SYSTEM ---");
            System.out.println("1. Add New Book");
            System.out.println("2. Display Inventory Catalog");
            System.out.println("3. Issue Book / Check-out");
            System.out.println("4. Exit");
            System.out.print("Enter your selection: ");
            choice = sc.nextInt();
            sc.nextLine();
            
            if (choice == 1) {
                if (bookCount < capacity) {
                    System.out.print("Enter Book Title: ");
                    titles[bookCount] = sc.nextLine();
                    System.out.print("Enter Author Name: ");
                    authors[bookCount] = sc.nextLine();
                    isIssued[bookCount] = 0;
                    bookCount++;
                    System.out.println("Book cataloged successfully.");
                } else {
                    System.out.println("Library inventory limits reached.");
                }
            } else if (choice == 2) {
                if (bookCount == 0) {
                    System.out.println("Catalog registry is currently empty.");
                } else {
                    System.out.println("\nIndex\tTitle\tAuthor\tStatus");
                    for (int i = 0; i < bookCount; i++) {
                        String status = (isIssued[i] == 1) ? "Checked Out" : "Available";
                        System.out.println((i + 1) + "\t" + titles[i] + "\t" + authors[i] + "\t" + status);
                    }
                }
            } else if (choice == 3) {
                System.out.print("Enter Book Title to issue: ");
                String searchTitle = sc.nextLine();
                int matched = 0;
                for (int i = 0; i < bookCount; i++) {
                    if (titles[i].equalsIgnoreCase(searchTitle)) {
                        matched = 1;
                        if (isIssued[i] == 0) {
                            isIssued[i] = 1;
                            System.out.println("Book successfully issued.");
                        } else {
                            System.out.println("This book is already loaned out.");
                        }
                        break;
                    }
                }
                if (matched == 0) {
                    System.out.println("Book not found in library registry.");
                }
            } else if (choice == 4) {
                System.out.println("Exiting System registry terminal application.");
            } else {
                System.out.println("Invalid selection options.");
            }
        }
        sc.close();
    }
}