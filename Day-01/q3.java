import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number: ");
        int x = sc.nextInt();

        long factorial = 1;

        if (x < 0) {
            System.out.println("Error");
        } else {
            for (int i = 1; i <= x; i++) {
                factorial = factorial * i;
            }
            System.out.println(factorial);
        }

        sc.close();
    }
}