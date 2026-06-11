import java.util.Scanner;

public class q85 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        
        int left = 0;
        int right = str.length() - 1;
        int isPalindrome = 1; 
        
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                isPalindrome = 0; 
                break;
            }
            left++;
            right--;
        }
        
        if (isPalindrome == 1) {
            System.out.println("The string is a Palindrome.");
        } else {
            System.out.println("The string is NOT a Palindrome.");
        }
        
        sc.close();
    }
}