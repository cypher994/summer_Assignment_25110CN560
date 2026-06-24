import java.util.Scanner;

public class q107 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter total number of staff members: ");
        int totalStaff = sc.nextInt();
        sc.nextLine();
        
        String[] names = new String[totalStaff];
        double[] baseSalaries = new double[totalStaff];
        double[] netSalaries = new double[totalStaff];
        
        for (int i = 0; i < totalStaff; i++) {
            System.out.println("\nRecording details for Employee #" + (i + 1));
            System.out.print("Name: ");
            names[i] = sc.nextLine();
            System.out.print("Monthly Base Salary: ");
            baseSalaries[i] = sc.nextDouble();
            sc.nextLine();
            
            double allowance = baseSalaries[i] * 0.12; 
            double taxDeduction = baseSalaries[i] * 0.15; 
            netSalaries[i] = baseSalaries[i] + allowance - taxDeduction;
        }
        
        System.out.println("\n--- STAFF MONTHLY PAYROLL SLIP DISBURSEMENT ---");
        System.out.printf("%-15s %-15s %-15s%n", "Name", "Base Salary", "Net Take-Home");
        System.out.println("----------------------------------------------");
        for (int i = 0; i < totalStaff; i++) {
            System.out.printf("%-15s $%-14.2f $%-14.2f%n", names[i], baseSalaries[i], netSalaries[i]);
        }
        
        sc.close();
    }
}