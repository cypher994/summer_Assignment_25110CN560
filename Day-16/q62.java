import java.util.Scanner;

public class q62 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int ele =-1;
        
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int maxcount = 0;
        for (int i = 0; i < n; i++){
            int count =0;
            for(int j =0; j<n;j++){
              if(arr[i] == arr[j]){
                count ++;
              }
            }
            if(count>maxcount){
                maxcount = count;
                ele = arr[i];
            }

        }
        System.out.println("The highest frequency element is:" + ele);
    }
}
