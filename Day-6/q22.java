import java.util.Scanner;

public class q22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Binary number: ");
        int binary = sc.nextInt();
        int decimal = 0;
        int multiplier = 1; // Represents the powers of 2 (1, 2, 4, 8, 16...)

        while (binary != 0) {
            int lastDigit = binary % 10;     
            decimal = decimal + (lastDigit * multiplier); 
            
            multiplier = multiplier * 2;     // Double the multiplier for the next position
            binary = binary / 10;           
        }

        System.out.println("Decimal equivalent: " + decimal);
        sc.close();
    }
}
