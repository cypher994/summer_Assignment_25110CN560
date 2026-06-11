import java.util.Scanner;

public class q81 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        
        int length = 0;
        for (char ch : str.toCharArray()) {
            length++;
        }
        
        System.out.println("The length of the string is: " + length);
        sc.close();
    }
}