import java.util.Scanner;

public class q93 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter original string: ");
        String str1 = sc.nextLine();
        System.out.print("Enter rotated string: ");
        String str2 = sc.nextLine();
        
        int Rotation = 0;
        
        if (str1.length() == str2.length() && str1.length() > 0) {
            String combined = str1 + str1;
            
            if (combined.contains(str2)) {
                Rotation = 1;
            }
        }
        
        if (Rotation == 1) {
            System.out.println("The string is a valid rotation.");
        } else {
            System.out.println("The string is NOT a valid rotation.");
        }
        
        sc.close();
    }
}