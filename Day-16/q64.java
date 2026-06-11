import java.util.Scanner;

public class q64 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        int[] temp = new int[n];
        int uniqueCount = 0;
        
        for (int i = 0; i < n; i++) {
            int isDuplicate = 0;
            
            for (int j = 0; j < uniqueCount; j++) {
                if (arr[i] == temp[j]) {
                    isDuplicate = 1;
                    break;
                }
            }
            
            if (isDuplicate == 0) {
                temp[uniqueCount] = arr[i];
                uniqueCount++;
            }
        }
        
        // Print the array up to the unique count threshold
        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i < uniqueCount; i++) {
            System.out.print(temp[i] + " ");
        }
        System.out.println();
        
        sc.close();
    }
}