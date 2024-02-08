package Assignment;
import java.util.Scanner;

public class student_names {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Define the maximum number of students
        final int MAX_STUDENTS = 10;

        // Create an array to store student names
        String[] studentNames = new String[MAX_STUDENTS];

        // Get the number of students to add
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();

        // Input student names
        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter student " + (i + 1) + " name (first last): ");
            studentNames[i] = scanner.nextLine();
        }

        // Get the surname to search
        System.out.print("Enter the surname to search: ");
        String surname = scanner.nextLine();

        // Search for the surname
        boolean found = false;
        for (String name : studentNames) {
            if (name != null && name.toUpperCase().split(" ")[1].equals(surname.toUpperCase())) {
                System.out.println("Full name: " + name);
                found = true;
                break; // Stop searching after finding the first match
            }
        }

        if (!found) {
            System.out.println("Student with surname " + surname + " not found.");
        }

        scanner.close();
    }
}
