import java.util.Scanner;

public class q21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt(); 

        int binary = 0;
        int placeValue = 1; 

        while (n != 0) {
            int remainder = n % 2;                      
            binary = binary + (remainder * placeValue);  
            placeValue = placeValue * 10;                
            n = n / 2;                                   
        }

        System.out.println("Binary equivalent: " + binary);
        sc.close();
    }
}