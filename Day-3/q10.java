import java.util.Scanner;

public class q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the range: ");
        int start = sc.nextInt();
        int end = sc.nextInt();

        for (int i = start; i <= end; i++) {
            if (i <= 1) {
                continue;
            }
            
            int is_prime = 1;
            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    is_prime = 0;
                    break;
                }
            }
            
            if (is_prime == 1) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        
    }
}