import java.util.Scanner;

public class q67 {
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
        
        int[] intersection = new int[Math.min(n1, n2)];
        int count = 0;
        
        System.out.print("Intersection of arrays: ");
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n2; j++) {
                if (arr1[i] == arr2[j]) {
                    int alreadyAdded = 0;
                    for (int k = 0; k < count; k++) {
                        if (arr1[i] == intersection[k]) {
                            alreadyAdded = 1;
                            break;
                        }
                    }
                    if (alreadyAdded == 0) {
                        intersection[count++] = arr1[i];
                        System.out.print(arr1[i] + " ");
                    }
                    break;
                }
            }
        }
        System.out.println();
        
        sc.close();
    }
}