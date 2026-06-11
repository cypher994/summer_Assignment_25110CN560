import java.util.Scanner;

public class q61 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the size of the array (n): ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        int actualSum = 0;
        System.out.println("Enter " + n + " elements (distinct numbers from 1 to " + (n + 1) + "):");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            actualSum += arr[i]; 
        }
        int totalElements = n + 1;    
        int expectedSum = (totalElements * (totalElements + 1)) / 2;
    
        int missingNumber = expectedSum - actualSum;
        
        System.out.println("The missing number is: " + missingNumber);
        
        sc.close();
    }
}