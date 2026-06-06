import java.util.Scanner;

public class q28 {
    public static void printReverse(int n) {
        if (n == 0) {
            return;
        }
        System.out.print(n % 10);
        printReverse(n / 10);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to reverse: ");
        int num = sc.nextInt();

        System.out.print("Reversed number: ");
        
        if (num == 0) {
            System.out.print(0);
        } else {
            printReverse(num);
        }
        System.out.println();
        sc.close();
    }
}