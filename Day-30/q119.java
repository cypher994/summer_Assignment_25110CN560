import java.util.Scanner;

public class q119 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter employee limit: ");
        int limit = sc.nextInt();
        sc.nextLine();
        
        String[] employees = new String[limit];
        int count = 0;
        
        int choice = 0;
        while (choice != 3) {
            System.out.println("\n1. Register Employee\n2. View Directory\n3. Exit");
            System.out.print("Choice: ");
            choice = sc.nextInt();
            sc.nextLine();
            
            if (choice == 1) {
                if (count < limit) {
                    System.out.print("Employee Name: ");
                    employees[count] = sc.nextLine();
                    count++;
                } else {
                    System.out.println("No space left.");
                }
            } else if (choice == 2) {
                for (int i = 0; i < count; i++) {
                    System.out.println((i + 1) + ". " + employees[i]);
                }
            }
        }
        sc.close();
    }
}