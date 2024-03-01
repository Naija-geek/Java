import java.util.Scanner;
public class YearOfBirthCalculator {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter their current age
        System.out.print("Enter your current age: ");
        int currentAge = scanner.nextInt();

        // Calculate the birth year by subtracting the current age from the current year
        int currentYear = java.time.Year.now().getValue();
        int birthYear = currentYear - currentAge;

        // Display the result
        System.out.println("Your year of birth is: " + birthYear);

        // Close the Scanner to avoid resource leaks
        scanner.close();
    }
}

