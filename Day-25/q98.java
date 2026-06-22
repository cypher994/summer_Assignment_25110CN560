import java.util.Scanner;

public class q98 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();
        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();
        
        int[] count1 = new int[256];
        int[] count2 = new int[256];
        
        for (int i = 0; i < str1.length(); i++) {
            count1[str1.charAt(i)]++;
        }
        
        for (int i = 0; i < str2.length(); i++) {
            count2[str2.charAt(i)]++;
        }
        
        System.out.print("Common characters: ");
        for (int i = 0; i < 256; i++) {
            if (count1[i] > 0 && count2[i] > 0) {
                int intersection = Math.min(count1[i], count2[i]);
                for (int j = 0; j < intersection; j++) {
                    System.out.print((char) i + " ");
                }
            }
        }
        System.out.println();
        
        sc.close();
    }
}