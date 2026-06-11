import java.util.Scanner;

public class q66 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter size of first array: ");
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        System.out.println("Enter elements of first array:");
        for (int i = 0; i < n1; i++) arr1[i] = sc.nextInt();
        
        System.out.print("Enter size of second array: ");
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        System.out.println("Enter elements of second array:");
        for (int i = 0; i < n2; i++) arr2[i] = sc.nextInt();
        
        int[] union = new int[n1 + n2];
        int count = 0;

        for (int i = 0; i < n1; i++) {
            int isDuplicate = 0;
            for (int j = 0; j < count; j++) {
                if (arr1[i] == union[j]) {
                    isDuplicate = 1;
                    break;
                }
            }
            if (isDuplicate == 0) {
                union[count] = arr1[i];
                count++;
            }
        }

        for (int i = 0; i < n2; i++) {
            int isDuplicate = 0;
            for (int j = 0; j < count; j++) {
                if (arr2[i] == union[j]) {
                    isDuplicate = 1;
                    break;
                }
            }
            if (isDuplicate == 0) {
                union[count] = arr2[i];
                count++;
            }
        }
        
        System.out.print("Union of arrays: ");
        for (int i = 0; i < count; i++) {
            System.out.print(union[i] + " ");
        }
        System.out.println();
        
        sc.close();
    }
}