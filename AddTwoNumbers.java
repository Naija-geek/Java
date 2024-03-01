import java.util.Scanner;
public class AddTwoNumbers {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Input for the first number
        System.out.print("Enter the first number: ");
        double firstNumber = scanner.nextDouble();

        // Input for the second number
        System.out.print("Enter the second number: ");
        double secondNumber = scanner.nextDouble();

        // Close the Scanner to avoid resource leak
        scanner.close();

        // Calculate the sum of the two numbers
        double sum = firstNumber + secondNumber;

        // Display the result
        System.out.println("The sum of " + firstNumber + " and " + secondNumber + " is: " + sum);
    }
}

