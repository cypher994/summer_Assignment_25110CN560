import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number: ");
        int x = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(i * x);
        }

        sc.close();
    }
}