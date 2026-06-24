import java.util.Scanner;

public class q108 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Student Name: ");
        String studentName = sc.nextLine();
        System.out.print("Enter Roll Number: ");
        String rollNum = sc.nextLine();
        
        System.out.print("Enter marks for Mathematics (out of 100): ");
        int math = sc.nextInt();
        System.out.print("Enter marks for Science (out of 100): ");
        int science = sc.nextInt();
        System.out.print("Enter marks for English (out of 100): ");
        int english = sc.nextInt();
        
        int totalObtained = math + science + english;
        double percentage = (totalObtained / 300.0) * 100;
        
        String grade;
        if (percentage >= 90) {
            grade = "A+";
        } else if (percentage >= 80) {
            grade = "A";
        } else if (percentage >= 70) {
            grade = "B";
        } else if (percentage >= 60) {
            grade = "C";
        } else if (percentage >= 50) {
            grade = "D";
        } else {
            grade = "Fail";
        }
        
        System.out.println("\n========================================");
        System.out.println("          ACADEMIC MARKSHEET            ");
        System.out.println("========================================");
        System.out.println("Student Name : " + studentName);
        System.out.println("Roll Number  : " + rollNum);
        System.out.println("----------------------------------------");
        System.out.println("Subject              Maximum    Obtained");
        System.out.println("----------------------------------------");
        System.out.println("Mathematics          100        " + math);
        System.out.println("Science              100        " + science);
        System.out.println("English              100        " + english);
        System.out.println("----------------------------------------");
        System.out.println("Total Secured: " + totalObtained + " / 300");
        System.out.printf("Percentage   : %.2f%%%n", percentage);
        System.out.println("Final Grade  : " + grade);
        System.out.println("========================================");
        
        sc.close();
    }
}