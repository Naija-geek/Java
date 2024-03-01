import java.util.Scanner;

public class HypotenuseCalculator {
    public static void main(String[] args) {
        // Create a Scanner object to take input
        Scanner scanner = new Scanner(System.in);

        // Input for side 'a'
        System.out.print("Enter the length of side 'a': ");
        double a = scanner.nextDouble();

        // Input for side 'b'
        System.out.print("Enter the length of side 'b': ");
        double b = scanner.nextDouble();

        // Close the Scanner to prevent resource leaks
        scanner.close();

        // Calculate the hypotenuse 'c' using the Pythagorean theorem: c = sqrt(a^2 + b^2)
        double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));

        // Display the result
        System.out.println("The length of the hypotenuse 'c' is: " + c);
    }
}

