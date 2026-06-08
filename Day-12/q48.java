import java.util.Scanner;

public class q48 {
    
    public static void checkPerfect(int n) {
        int sum = 0;
        
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum += i; 
            }
        }
        if (sum == n) {
            System.out.println(n + " is a Perfect Number.");
        } else {
            System.out.println(n + " is NOT a Perfect Number.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check Perfect Number: ");
        int num = sc.nextInt();

        checkPerfect(num);
    }
}