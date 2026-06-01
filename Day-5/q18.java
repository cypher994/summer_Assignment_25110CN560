import java.util.Scanner;

public class q18 {
    public static void main(String[] args) {
        System.out.print("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int original = n;
        while (n!=0) {
            int r = n%10;
            int f = 1;
            for(int i=r; i>0; i-- ){
                f = f*i;
            }
            sum = sum+f;
            n = n/10;
        }
        if (sum == original) {
            System.out.println("The entered number is strong number");
        }
        else System.out.println("Not a strong number");

    }
}
