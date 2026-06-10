import java.util.Scanner;

public class q53 {
    public static void Linearsearch(int[] arr, int target) {
        int found = -1;
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                found = i;
                break; 
            }
        }
        
        if (found != -1) {
            System.out.println("Element " + target + " found at index: " + found);
        } else {
            System.out.println("Element " + target + " is not present in the array.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        System.out.print("Enter the element to search for: ");
        int target = sc.nextInt();
        
        Linearsearch(arr, target);
        sc.close();
    }
}