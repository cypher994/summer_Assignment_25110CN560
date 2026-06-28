import java.util.Scanner;

public class q117 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter capacity: ");
        int capacity = sc.nextInt();
        sc.nextLine();
        
        String[] ids = new String[capacity];
        String[] names = new String[capacity];
        int count = 0;
        
        int choice = 0;
        while (choice != 3) {
            System.out.println("\n1. Add Student\n2. View Students\n3. Exit");
            System.out.print("Choice: ");
            choice = sc.nextInt();
            sc.nextLine();
            
            if (choice == 1) {
                if (count < capacity) {
                    System.out.print("ID: ");
                    ids[count] = sc.nextLine();
                    System.out.print("Name: ");
                    names[count] = sc.nextLine();
                    count++;
                } else {
                    System.out.println("Full.");
                }
            } else if (choice == 2) {
                for (int i = 0; i < count; i++) {
                    System.out.println(ids[i] + " - " + names[i]);
                }
            }
        }
        sc.close();
    }
}