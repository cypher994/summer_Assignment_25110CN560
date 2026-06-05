import java.util.Scanner;

public class q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        int sum = 0;
        while (n != 0) {
            int r = n % 10;
            sum = sum + r;
            n = n / 10;
        }

        System.out.println(sum);

        sc.close();
    }
}