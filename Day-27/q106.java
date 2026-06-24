import java.util.Scanner;

public class q106 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter maximum number of employees to store: ");
        int maxEmployees = sc.nextInt();
        sc.nextLine();
        
        int[] ids = new int[maxEmployees];
        String[] names = new String[maxEmployees];
        String[] departments = new String[maxEmployees];
        int employeeCount = 0;
        
        int choice = 0;
        while (choice != 4) {
            System.out.println("\n--- EMPLOYEE MANAGEMENT SYSTEM ---");
            System.out.println("1. Add Employee");
            System.out.println("2. Display All Employees");
            System.out.println("3. Fire/Remove Employee");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            
            if (choice == 1) {
                if (employeeCount < maxEmployees) {
                    System.out.print("Enter Employee ID: ");
                    ids[employeeCount] = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Name: ");
                    names[employeeCount] = sc.nextLine();
                    System.out.print("Enter Department: ");
                    departments[employeeCount] = sc.nextLine();
                    employeeCount++;
                    System.out.println("Employee profile created successfully.");
                } else {
                    System.out.println("Database full.");
                }
            } else if (choice == 2) {
                if (employeeCount == 0) {
                    System.out.println("No employees listed.");
                } else {
                    System.out.println("\nID\tName\tDepartment");
                    for (int i = 0; i < employeeCount; i++) {
                        System.out.println(ids[i] + "\t" + names[i] + "\t" + departments[i]);
                    }
                }
            } else if (choice == 3) {
                System.out.print("Enter Employee ID to remove: ");
                int targetId = sc.nextInt();
                int index = -1;
                for (int i = 0; i < employeeCount; i++) {
                    if (ids[i] == targetId) {
                        index = i;
                        break;
                    }
                }
                if (index != -1) {
                    for (int i = index; i < employeeCount - 1; i++) {
                        ids[i] = ids[i + 1];
                        names[i] = names[i + 1];
                        departments[i] = departments[i + 1];
                    }
                    employeeCount--;
                    System.out.println("Employee removed from system.");
                } else {
                    System.out.println("Employee ID not found.");
                }
            } else if (choice == 4) {
                System.out.println("Exiting Employee Management System.");
            } else {
                System.out.println("Invalid option.");
            }
        }
        sc.close();
    }
}