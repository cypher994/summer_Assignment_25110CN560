import java.util.Scanner;

public class q105 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter maximum number of students to store: ");
        int maxStudents = sc.nextInt();
        sc.nextLine();
        
        int[] ids = new int[maxStudents];
        String[] names = new String[maxStudents];
        double[] gpas = new double[maxStudents];
        int studentCount = 0;
        
        int choice = 0;
        while (choice != 4) {
            System.out.println("\n--- STUDENT RECORD MANAGEMENT ---");
            System.out.println("1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Search Student by ID");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            
            if (choice == 1) {
                if (studentCount < maxStudents) {
                    System.out.print("Enter Student ID: ");
                    ids[studentCount] = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Student Name: ");
                    names[studentCount] = sc.nextLine();
                    System.out.print("Enter Student GPA: ");
                    gpas[studentCount] = sc.nextDouble();
                    studentCount++;
                    System.out.println("Student record added successfully.");
                } else {
                    System.out.println("Database full! Cannot add more records.");
                }
            } else if (choice == 2) {
             
                    System.out.println("\nID\tName\tGPA");
                    for (int i = 0; i < studentCount; i++) {
                        System.out.println(ids[i] + "\t" + names[i] + "\t" + gpas[i]);
                    }
                
            } else if (choice == 3) {
                System.out.print("Enter ID to search: ");
                int searchId = sc.nextInt();
                int found = 0;
                for (int i = 0; i < studentCount; i++) {
                    if (ids[i] == searchId) {
                        System.out.println("Record Found: Name = " + names[i] + ", GPA = " + gpas[i]);
                        found = 1;
                        break;
                    }
                }
                if (found == 0) {
                    System.out.println("Student with ID " + searchId + " not found.");
                }
            } else if (choice == 4) {
                System.out.println("Exiting Student Record Management System.");
            } else {
                System.out.println("Invalid option selected.");
            }
        }
        sc.close();
    }
}