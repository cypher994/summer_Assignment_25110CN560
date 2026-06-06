import java.util.Scanner;

public class q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        int is_prime = 1;

        if (n <= 1) {
            is_prime = 0;
        } else {
            for (int i = 2; i * i <= n; i++) {
                if (n % i == 0) {
                    is_prime = 0;
                    break;
                }
            }
        }

        if (is_prime == 1) {
            System.out.println("Prime");
        } else {
            System.out.println("Not Prime");
        }

      
    }
}