import java.util.Scanner;

public class q69 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of  array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements of array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for(int i=0; i<n; i++){
            for(int j =i+1; j<n;j++){
                if (arr[i]>arr[j]) {
                    int temp = arr[i];
                    arr[i]= arr[j];
                    arr[j]= temp;
                }
            }
        }
        System.out.println("The sorted array is ");
        for (int ele : arr) {
            System.out.print(ele+" ");
        }
    }
}
