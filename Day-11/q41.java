import java.util.Scanner;

public class q41 {
    public static int findSum(int num1, int num2) {
        return num1 + num2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        int sum = findSum(a, b);
        System.out.println("The sum is: " + sum);

        sc.close();
    }
}