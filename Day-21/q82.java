import java.util.Scanner;

public class q82 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a string to reverse: ");
        String original = sc.nextLine();
        
        String reversed = "";
        
       
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed += original.charAt(i); 
        }
        
        System.out.println("Reversed string: " + reversed);
        sc.close();
    }
}