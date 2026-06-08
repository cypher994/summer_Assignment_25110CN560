import java.util.Scanner;

public class q47 {
    
    public static void Fibonacci(int n) {
        int a = 0, b = 1;
        System.out.print("Fibonacci Series up to " + n + " terms: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms for Fibonacci: ");
        int terms = sc.nextInt();
        Fibonacci(terms);

    }
}