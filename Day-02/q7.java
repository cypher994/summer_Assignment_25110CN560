import java.util.Scanner;

public class q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        int product = 1;
        if (n == 0) {
            product = 0;
        }

        while (n != 0) {
            int rev = n % 10;
            product = product * rev;
            n = n / 10;
        }

        System.out.println(product);

        sc.close();
    }
}