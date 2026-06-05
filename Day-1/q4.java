import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number: ");
        long n = sc.nextLong();

        int count = 0;

        if (n == 0) {
            count = 1;
        }

        while (n != 0) {
            n = n / 10;
            count++;
        }

        System.out.println(count);

        sc.close();
    }
}