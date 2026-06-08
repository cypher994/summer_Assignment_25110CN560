import java.util.Scanner;

public class q45 {
    
    public static boolean isPalindrome(int n) {
        
        int original = n;
        int reversed = 0;
        
        while (n > 0) {
            int last = n % 10;
            reversed = (reversed * 10) + last;
            n = n / 10;
        }
        
        return original == reversed;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (isPalindrome(num)) {
           System.out.println(num + " is Palindrome"); 
        }
       else System.out.println("Not a palindrome");
    }
}