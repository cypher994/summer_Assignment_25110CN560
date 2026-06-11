import java.util.Scanner;

public class q78 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter size of square matrix (N): ");
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];
        
        System.out.println("Enter elements of the matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) matrix[i][j] = sc.nextInt();
        }
        
        int isSymmetric = 1; 
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] != matrix[j][i]) {
                    isSymmetric = 0; // Mismatch found
                    break;
                }
            }
            if (isSymmetric == 0) break;
        }
        
        if (isSymmetric == 1) {
            System.out.println("The matrix is Symmetric.");
        } else {
            System.out.println("The matrix is NOT Symmetric.");
        }
        
        sc.close();
    }
}