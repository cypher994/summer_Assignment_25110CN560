import java.util.Scanner;
import java.util.Arrays;

public class q56 {
    public static void printDuplicates(int[] arr) {
        int n = arr.length;
        int found = 0;
        Arrays.sort(arr);

        System.out.print("Duplicate elements are: ");
        
    
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                System.out.print(arr[i] + " ");
                found = 1;
            }
        }
        if (found == 0) {
            System.out.print("None");
        }
        System.out.println();
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

        printDuplicates(arr);
        sc.close();
    }
}