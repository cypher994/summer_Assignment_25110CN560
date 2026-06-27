import java.util.Scanner;

public class q115 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        
        while (choice != 5) {
            System.out.println("\n--- STRING OPERATIONS MENU ---");
            System.out.println("1. Palindrome Check");
            System.out.println("2. Reverse String");
            System.out.println("3. Check Substring Presence");
            System.out.println("4. Convert to Uppercase");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); 
            
            if (choice >= 1 && choice <= 4) {
                System.out.print("Enter the target string: ");
                String input = sc.nextLine();
                
                if (choice == 1) {
                    int left = 0, right = input.length() - 1;
                    boolean isPalin = true;
                    while (left < right) {
                        if (input.charAt(left) != input.charAt(right)) {
                            isPalin = false;
                            break;
                        }
                        left++;
                        right--;
                    }
                    System.out.println("Is Palindrome: " + isPalin);
                } else if (choice == 2) {
                    String rev = "";
                    for (int i = input.length() - 1; i >= 0; i--) {
                        rev += input.charAt(i);
                    }
                    System.out.println("Reversed String: " + rev);
                } else if (choice == 3) {
                    System.out.print("Enter substring to check: ");
                    String sub = sc.nextLine();
                    System.out.println("Contains Substring: " + input.contains(sub));
                } else if (choice == 4) {
                    System.out.println("Uppercase Result: " + input.toUpperCase());
                }
            } else if (choice == 5) {
                System.out.println("Exiting String Operations System.");
            } else {
                System.out.println("Invalid option choice.");
            }
        }
        sc.close();
    }
}