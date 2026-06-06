import java.util.Scanner;   
public class q37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows ");
        int n = sc.nextInt();
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j < n+1-i; j++) {
                System.out.print("  ");
            }            
            for (int index = 1; index <= 2*i-1; index++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
