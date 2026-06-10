import java.util.Scanner;

public class q55 {
    public static void SecondLargest(int[] arr) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest; 
                largest = arr[i];        
            } else if (arr[i] < largest && arr[i] > secondLargest) {
                secondLargest = arr[i];  
            }
        }
        System.out.println("The second largest element is: " + secondLargest);
        
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
        
        SecondLargest(arr);
        sc.close();
    }
}