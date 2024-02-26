//Calculate the factorial of a number:
public class factorial {
  public static void main(String[] args) {
    int number = 5;
    int result = 1;
    for (int i = 1; i <= number; i++) {
      result *= i;
    }
    System.out.println("The factorial of " + number + " is: " + result);
  }
}