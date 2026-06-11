import java.util.Scanner;

public class q76 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the size of the square matrix (N): ");
        int n = sc.nextInt();
        
        int[][] matrix = new int[n][n];
        
        System.out.println("Enter a " + n + "x" + n + " matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        
        int primarySum = 0;
        int secondarySum = 0;
        for (int i = 0; i < n; i++) {
            primarySum += matrix[i][i];              
            secondarySum += matrix[i][n - 1 - i];   
        }
   
        if (n % 2 != 0) {
            secondarySum -= matrix[n / 2][n / 2];
        }
        
        int totalSum = primarySum + secondarySum;
        
        System.out.println("Primary Diagonal Sum: " + primarySum);
        System.out.println("Secondary Diagonal Sum: " + secondarySum);
        System.out.println("Total Diagonal Sum: " + totalSum);
        
        sc.close();
    }
}