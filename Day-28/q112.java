import java.util.Scanner;

public class q112 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Specify phonebook local contact bounds limitation: ");
        int bounds = sc.nextInt();
        sc.nextLine();
        
        String[] contactNames = new String[bounds];
        String[] phoneNumbers = new String[bounds];
        int storageIdxCount = 0;
        
        int choice = 0;
        while (choice != 4) {
            System.out.println("\n--- SIM CARD CONTACT DIRECTORY LAYOUT ---");
            System.out.println("1. Store Identity Profile Card");
            System.out.println("2. Display Local Storage Directory");
            System.out.println("3. Look up Metadata Details by Name Query");
            System.out.println("4. Disconnect Local Core Terminal UI");
            System.out.print("Trigger prompt path sequence: ");
            choice = sc.nextInt();
            sc.nextLine();
            
            if (choice == 1) {
                if (storageIdxCount < bounds) {
                    System.out.print("Input Full Display Name: ");
                    contactNames[storageIdxCount] = sc.nextLine();
                    System.out.print("Input Tel Com Mobile Reference Digit String: ");
                    phoneNumbers[storageIdxCount] = sc.nextLine();
                    storageIdxCount++;
                    System.out.println("Contact synchronized locally.");
                } else {
                    System.out.println("Hard Drive Error: Target directory container structural block full.");
                }
            } else if (choice == 2) {
                if (storageIdxCount == 0) {
                    System.out.println("Local contact directories are cleared completely.");
                } else {
                    System.out.println("\nDisplay Index Name Structure\tDial Value Path Details");
                    for (int i = 0; i < storageIdxCount; i++) {
                        System.out.println(contactNames[i] + "\t-->\t" + phoneNumbers[i]);
                    }
                }
            } else if (choice == 3) {
                System.out.print("Input Identity Target String to fetch matching nodes: ");
                String searchTargetName = sc.nextLine();
                int trackingLookupResultFlag = 0;
                
                for (int i = 0; i < storageIdxCount; i++) {
                    if (contactNames[i].equalsIgnoreCase(searchTargetName)) {
                        System.out.println("Identity Verified Match Captured: Tel Call Endpoint Line = " + phoneNumbers[i]);
                        trackingLookupResultFlag = 1;
                        break;
                    }
                }
                if (trackingLookupResultFlag == 0) {
                    System.out.println("No records returned validating input signature.");
                }
            } else if (choice == 4) {
                System.out.println("Shutdown execution operations initiated successfully.");
            } else {
                System.out.println("Command string evaluation failure.");
            }
        }
        sc.close();
    }
}