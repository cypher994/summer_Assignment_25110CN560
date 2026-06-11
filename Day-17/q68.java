import java.util.Scanner;

public class q68 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of sorted array 1: ");
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        System.out.println("Enter elements (sorted):");
        for (int i = 0; i < n1; i++) arr1[i] = sc.nextInt();

        System.out.print("Enter size of sorted array 2: ");
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        System.out.println("Enter elements (sorted):");
        for (int i = 0; i < n2; i++) arr2[i] = sc.nextInt();
 
        System.out.print("Enter size of sorted array 3: ");
        int n3 = sc.nextInt();
        int[] arr3 = new int[n3];
        System.out.println("Enter elements (sorted):");
        for (int i = 0; i < n3; i++) arr3[i] = sc.nextInt();

        int i = 0, j = 0, k = 0;
        
        System.out.print("Common elements across all three arrays: ");
        while (i < n1 && j < n2 && k < n3) {
            if (arr1[i] == arr2[j] && arr2[j] == arr3[k]) {
                System.out.print(arr1[i] + " ");
                i++; j++; k++;
            }
            else if (arr1[i] < arr2[j]) {
                i++;
            } else if (arr2[j] < arr3[k]) {
                j++;
            } else {
                k++;
            }
        }
        System.out.println();
        
        sc.close();
    }
}