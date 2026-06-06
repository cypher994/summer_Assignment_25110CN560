import java.util.Scanner;   
public class q40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows ");
        int n = sc.nextInt();
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <n+1-i; j++) {
                System.out.print("  ");
            }            
            for (int index = 1; index <= i; index++) {
                System.out.print((char)(index+64)+" ");
            }
            int a = i-1;
            for (int index = 2; index <= i ; index++) {
                    System.out.print((char)(a+64)+" ");
                    a--;
            }
           
            System.out.println();
        }
    }
}
