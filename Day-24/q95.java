import java.util.Scanner;

public class q95 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();
        
        String longestWord = "";
        String currentWord = "";
        
        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);
            
            if (ch != ' ') {
                currentWord += ch;
            } 
            
            if (ch == ' ' || i == sentence.length() - 1) {
                if (currentWord.length() > longestWord.length()) {
                    longestWord = currentWord;
                }
                currentWord = "";
            }
        }
        
        System.out.println("The longest word is: " + longestWord);
        sc.close();
    }
}