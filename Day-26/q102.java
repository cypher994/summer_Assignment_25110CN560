import java.util.Scanner;

public class q102 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        
        if (age < 0) {
            System.out.println("Invalid age entered.");
        } else if (age >= 18) {
            System.out.println("You are eligible to vote.");
        } else {
            int yearsLeft = 18 - age;
            System.out.println("You are not eligible to vote. You can vote after " + yearsLeft + " years.");
        }
        
        sc.close();
    }
}