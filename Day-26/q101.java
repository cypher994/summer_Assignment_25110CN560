import java.util.Scanner;
import java.util.Random;

public class q101 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        
        int targetNumber = rand.nextInt(100) + 1;
        int userGuess = 0;
        int attempts = 0;
        
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have chosen a number between 1 and 100. Try to guess it!");
        
        while (userGuess != targetNumber) {
            System.out.print("Enter your guess: ");
            userGuess = sc.nextInt();
            attempts++;
            
            if (userGuess < targetNumber) {
                System.out.println("Too low! Try again.");
            } else if (userGuess > targetNumber) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
            }
        }
        
        sc.close();
    }
}