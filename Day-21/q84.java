import java.util.Scanner;

public class q84 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a string in lowercase: ");
        String str = sc.nextLine();
        
        String result = "";
        
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                ch = (char) (ch - 32);
            }
            
            result += ch;
        }
        
        System.out.println("String in Uppercase: " + result);
        sc.close();
    }
}