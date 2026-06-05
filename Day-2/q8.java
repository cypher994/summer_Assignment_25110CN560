import java.util.Scanner;

public class q8{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        int num = n;
        int reverse = 0;

        while (n != 0) {
            int rev = n % 10;
            reverse = reverse * 10 + rev;
            n = n / 10;
        }

        if (num == reverse) {
            System.out.println("the number is a palindrome");
        } else {
            System.out.println("the number is not a palindrome");
        }

        sc.close();
    }
}