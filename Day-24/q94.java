import java.util.Scanner;

public class q94 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a string to compress: ");
        String str = sc.nextLine();
        
        String compressed = "";
        int n = str.length();
        
        for (int i = 0; i < n; i++) {
            int count = 1;
            
            while (i < n - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }
            
            compressed += str.charAt(i);
            compressed += count;
        }
        
        if (compressed.length() < str.length()) {
            System.out.println("Compressed string: " + compressed);
        } else {
            System.out.println("Original string (Compression didn't save space): " + str);
        }
        
        sc.close();
    }
}