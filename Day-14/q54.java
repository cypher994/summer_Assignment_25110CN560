import java.util.Scanner;

public class q54 {
    public static void countt(int[] arr, int target) {
        int count = 0;
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                count++;
            }
        }
        
        System.out.println("The element " + target + " appears " + count + " times in the array.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        System.out.print("Enter the element to count frequency for: ");
        int target = sc.nextInt();
        
        countt(arr, target);
        sc.close();
    }
}