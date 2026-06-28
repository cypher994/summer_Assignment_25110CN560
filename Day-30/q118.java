import java.util.Scanner;

public class q118 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter library size: ");
        int size = sc.nextInt();
        sc.nextLine();
        
        String[] books = new String[size];
        int count = 0;
        
        int choice = 0;
        while (choice != 3) {
            System.out.println("\n1. Add Book\n2. View Books\n3. Exit");
            System.out.print("Choice: ");
            choice = sc.nextInt();
            sc.nextLine();
            
            if (choice == 1) {
                if (count < size) {
                    System.out.print("Book Title: ");
                    books[count] = sc.nextLine();
                    count++;
                } else {
                    System.out.println("Library Full.");
                }
            } else if (choice == 2) {
                for (int i = 0; i < count; i++) {
                    System.out.println((i + 1) + ". " + books[i]);
                }
            }
        }
        sc.close();
    }
}