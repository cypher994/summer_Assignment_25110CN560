import java.util.Scanner;

public class q43 {
    // Function to check if a number is prime
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }  
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false; 
            }
        }
        return true; 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check prime: ");
        int num = sc.nextInt();
        
        if (isPrime(num)) {
            System.out.println(num + " is a Prime Number.");
        } else {
            System.out.println(num + " is NOT a Prime Number.");
        }
        sc.close();
    }
}