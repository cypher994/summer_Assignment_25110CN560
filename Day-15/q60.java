import java.util.Scanner;

public class q60 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        int nzero = 0; 
        
    
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[nzero] = arr[i];
                nzero++;
            }
        }
        
        while (nzero < n) {
            arr[nzero] = 0;
            nzero++;
        }
        
        System.out.print("Array after moving zeroes: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        
        sc.close();
    }
}