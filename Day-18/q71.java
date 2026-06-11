import java.util.Scanner;
import java.util.Arrays;

public class q71 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        Arrays.sort(arr);
        System.out.print("Sorted array used for search: ");
        for (int val : arr) System.out.print(val + " ");
        System.out.println();
        
        System.out.print("Enter the element to search for: ");
        int target = sc.nextInt();
        int low = 0;
        int high = n - 1;
        int foundIndex = -1;
        
        while (low <= high) {
            int mid = low + (high - low) / 2; 
            
            if (arr[mid] == target) {
                foundIndex = mid;
                break;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        
        if (foundIndex != -1) {
            System.out.println("Element " + target + " found at index " + foundIndex + " in the sorted array.");
        } else {
            System.out.println("Element " + target + " is not present in the array.");
        }
        
        sc.close();
    }
}