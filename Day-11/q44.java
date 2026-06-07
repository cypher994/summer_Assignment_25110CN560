import java.util.Scanner;

public class q44 {
    public static int findFactorial(int n) {
        int factorial = 1; 
        
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number for factorial: ");
        int num = sc.nextInt();
        int result = findFactorial(num);
         System.out.println("The factorial of " + num + " is: " + result);
    }
}