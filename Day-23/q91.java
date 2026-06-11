import java.util.Scanner;

public class q91 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();
        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();
        
        int isAnagram = 1;
        
        if (str1.length() != str2.length()) {
            isAnagram = 0;
        } else {
            int[] count = new int[256];
            
            for (int i = 0; i < str1.length(); i++) {
                count[str1.charAt(i)]++;
                count[str2.charAt(i)]--;
            }
            
            for (int i = 0; i < 256; i++) {
                if (count[i] != 0) {
                    isAnagram = 0;
                    break;
                }
            }
        }
        
        if (isAnagram == 1) {
            System.out.println("The strings are Anagrams.");
        } else {
            System.out.println("The strings are NOT Anagrams.");
        }
        
        sc.close();
    }
}