import java.util.Scanner;

public class q23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a binary number to count set bits: ");
        int binary = sc.nextInt(); 

        int count = 0;

        while (binary != 0) {
            int lastDigit = binary % 10; // 1. Peel off the last digit (0 or 1)
            
            if (lastDigit == 1) {
                count++;                 // 2. If it's a 1, increase our count
            }
            
            binary = binary / 10;       // 3. Throw away the last digit to move left
        }

        System.out.println("Number of set bits: " + count);
        sc.close();
    }
}