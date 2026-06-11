import java.util.Scanner;

public class q90 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        
        int[] freq = new int[256];
        char result = ' ';
        
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            freq[ch]++;
            
            if (freq[ch] == 2) {
                result = ch;
                break;
            }
        }
        
        if (result != ' ') {
            System.out.println("First repeating character is: " + result);
        } else {
            System.out.println("No repeating character found.");
        }
        
        sc.close();
    }
}