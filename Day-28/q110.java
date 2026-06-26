import java.util.Scanner;

public class q110 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Set max core consumer base cap: ");
        int maxAccounts = sc.nextInt();
        sc.nextLine();
        
        String[] accountNumbers = new String[maxAccounts];
        String[] accountHolders = new String[maxAccounts];
        double[] liquidBalances = new double[maxAccounts];
        int activeLedgerCount = 0;
        
        int choice = 0;
        while (choice != 4) {
            System.out.println("\n--- CORE RETAILED RETAINMENT PORTAL ---");
            System.out.println("1. Create Core Checking Account");
            System.out.println("2. Display Complete Consumer Profiles");
            System.out.println("3. Wire Fund Transfer Transaction");
            System.out.println("4. Exit Terminal Interface");
            System.out.print("Select operational node: ");
            choice = sc.nextInt();
            sc.nextLine();
            
            if (choice == 1) {
                if (activeLedgerCount < maxAccounts) {
                    System.out.print("Assign Unique Account Number: ");
                    accountNumbers[activeLedgerCount] = sc.nextLine();
                    System.out.print("Enter Primary Applicant Full Name: ");
                    accountHolders[activeLedgerCount] = sc.nextLine();
                    System.out.print("Process Initial Funding Deposit: $");
                    liquidBalances[activeLedgerCount] = sc.nextDouble();
                    activeLedgerCount++;
                    System.out.println("Escrow Account created.");
                } else {
                    System.out.println("Database allocation constraints met.");
                }
            } else if (choice == 2) {
                if (activeLedgerCount == 0) {
                    System.out.println("No account ledgers processed currently.");
                } else {
                    System.out.println("\nAcc Num\tHolder Name\tBalance");
                    for (int i = 0; i < activeLedgerCount; i++) {
                        System.out.println(accountNumbers[i] + "\t" + accountHolders[i] + "\t$" + liquidBalances[i]);
                    }
                }
            } else if (choice == 3) {
                System.out.print("Sender Account Number: ");
                String sourceAcc = sc.nextLine();
                System.out.print("Recipient Account Number: ");
                String destAcc = sc.nextLine();
                System.out.print("Transfer Wire Quantity: $");
                double transferAmount = sc.nextDouble();
                
                int sourceIdx = -1, destIdx = -1;
                for (int i = 0; i < activeLedgerCount; i++) {
                    if (accountNumbers[i].equals(sourceAcc)) sourceIdx = i;
                    if (accountNumbers[i].equals(destAcc)) destIdx = i;
                }
                
                if (sourceIdx != -1 && destIdx != -1) {
                    if (liquidBalances[sourceIdx] >= transferAmount) {
                        liquidBalances[sourceIdx] -= transferAmount;
                        liquidBalances[destIdx] += transferAmount;
                        System.out.println("Transaction finalized successfully.");
                    } else {
                        System.out.println("Rejected: Insufficient clearing funds.");
                    }
                } else {
                    System.out.println("Routing Validation Error: One or both endpoints missing.");
                }
            } else if (choice == 4) {
                System.out.println("System logging out.");
            } else {
                System.out.println("Operational code incorrect.");
            }
        }
        sc.close();
    }
}