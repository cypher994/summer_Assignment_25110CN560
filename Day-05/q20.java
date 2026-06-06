import java.util.Scanner;

public class q20 {
    public static void main(String[] args) {
        System.out.print("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int largest = 1;

        // Loop starts from 2 and goes up to n
        for (int i = 2; i <= n; i++) {
            // If i divides n perfectly, it means i is a factor
            while (n % i == 0) {
                largest = i; // Keep tracking the latest factor found
                n = n / i;         // Reduce n by dividing it
            }
        }

        System.out.println("The largest prime factor is: " + largest);
        
        sc.close();
    }
}