import java.util.Scanner;

public class q19 {
    public static void main(String[] args) {
         System.out.print("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <=n; i++) {
            if (n%i==0) {
                System.out.print(" "+i);
            }            
        }
    }
}
