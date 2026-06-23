import java.util.Scanner;

public class q104 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = 0;
        
        System.out.println("--- Welcome to the Mini Java Quiz ---");
        
        System.out.println("\nQ1. What is the default value of an int variable in Java?");
        System.out.println("1) null\n2) 0\n3) 1\n4) Undefined");
        System.out.print("Your answer (1-4): ");
        int ans1 = sc.nextInt();
        if (ans1 == 2) {
            score++;
        }
        
        System.out.println("\nQ2. Which keyword is used to inherit a class in Java?");
        System.out.println("1) implements\n2) inherits\n3) extends\n4) imports");
        System.out.print("Your answer (1-4): ");
        int ans2 = sc.nextInt();
        if (ans2 == 3) {
            score++;
        }
        
        System.out.println("\nQ3. Which component is responsible for running compiled Java bytecode?");
        System.out.println("1) JDK\n2) JVM\n3) JRE\n4) JIT");
        System.out.print("Your answer (1-4): ");
        int ans3 = sc.nextInt();
        if (ans3 == 2) {
            score++;
        }
        
        System.out.println("\n--- Quiz Complete ---");
        System.out.println("Your Final Score: " + score + " / 3");
        
        sc.close();
    }
}