import java.util.Scanner;

public class q103 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double balance = 5000.00;
        int choice = 0;
        
        while (choice != 4) {
            System.out.println("\n--- ATM MENU ---");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            
            if (choice == 1) {
                System.out.println("Current Balance: $" + balance);
            } else if (choice == 2) {
                System.out.print("Enter deposit amount: ");
                double deposit = sc.nextDouble();
                if (deposit > 0) {
                    balance += deposit;
                    System.out.println("$" + deposit + " deposited successfully.");
                } else {
                    System.out.println("Invalid deposit amount.");
                }
            } else if (choice == 3) {
                System.out.print("Enter withdrawal amount: ");
                double withdrawal = sc.nextDouble();
                if (withdrawal > balance) {
                    System.out.println("Insufficient balance.");
                } else if (withdrawal <= 0) {
                    System.out.println("Invalid withdrawal amount.");
                } else {
                    balance -= withdrawal;
                    System.out.println("$" + withdrawal + " withdrawn successfully.");
                }
            } else if (choice == 4) {
                System.out.println("Thank you for using our ATM. Goodbye!");
            } else {
                System.out.println("Invalid choice. Please select a valid option.");
            }
        }
        
        sc.close();
    }
}