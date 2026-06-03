import java.util.Scanner;

public class q27 {
    // Recursive function to calculate sum of digits
    public static int sumOfDigits(int n) {
        if (n == 0) {
            return 0;
        }
        
        int lastDigit = n % 10;
        int remainingDigits = n / 10;
        
        return lastDigit + sumOfDigits(remainingDigits);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Handle negative numbers by converting them to positive
        int absoluteNum = Math.abs(num);

        int result = sumOfDigits(absoluteNum);
        System.out.println("The sum of digits of " + num + " is: " + result);
        
        sc.close();
    }
}