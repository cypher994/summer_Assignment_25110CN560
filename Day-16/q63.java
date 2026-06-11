import java.util.Scanner;

public class q63 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        System.out.print("Enter the target sum: ");
        int targetSum = sc.nextInt();
        
        int pairFound = 0;
        
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == targetSum) {
                    System.out.println("Pair found: (" + arr[i] + ", " + arr[j] + ")");
                    pairFound = 1;
                    break; 
                }
            }
            if (pairFound == 1) {
                break; 
            }
        }
        
        if (pairFound == 0) {
            System.out.println("No pair exists with the given sum.");
        }
        
        sc.close();
    }
}