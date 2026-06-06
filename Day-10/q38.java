import java.util.Scanner;   
public class q38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows ");
        int n = sc.nextInt();
        int stars = 2*n-1;
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <i; j++) {
                System.out.print("  ");
            }            
            for (int index = 1; index <= stars; index++) {
                System.out.print("* ");
            }
            stars -=2;
            System.out.println();
        }
    }
}
