import java.util.Scanner;

public class q86 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();
        
        int wordCount = 0;
        
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) != ' ') {
                if (i == 0 || sentence.charAt(i - 1) == ' ') {
                    wordCount++;
                }
            }
        }
        
        System.out.println("Total word count: " + wordCount);
        sc.close();
    }
}