import java.util.Scanner;

public class q46 {
    
    public static void checkArmstrong(int n) {
        int original = n;
        int temp = n;
        int count = 0;
        while (temp > 0) {
            count++;
            temp /= 10;
        }
        int sum = 0;
        temp = n;
        while (temp > 0) {
            int lastDigit = temp % 10;
            sum += Math.pow(lastDigit, count);
            temp /= 10;
        }
        
        if (original == sum) {
            System.out.println(original + " is an Armstrong Number.");
        } else {
            System.out.println(original + " is NOT an Armstrong Number.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check Armstrong: ");
        int num = sc.nextInt();
        
        checkArmstrong(num);
        sc.close();
    }
}