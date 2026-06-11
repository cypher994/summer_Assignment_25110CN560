import java.util.Scanner;

public class q88 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a string with spaces: ");
        String original = sc.nextLine();
        
        String result = "";
        
        for (int i = 0; i < original.length(); i++) {
            char ch = original.charAt(i);
            
            if (ch != ' ') {
                result += ch;
            }
        }
        
        System.out.println("String after removing spaces: " + result);
        sc.close();
    }
}