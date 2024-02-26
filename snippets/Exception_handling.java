
public class Exception_handling {

  public static void main(String[] args) {
    try {
      int result = 10 / 0;
      System.out.println(result); // This line will not be executed
    } catch (ArithmeticException e) {
      System.out.println("Error: Division by zero!");
    }
  }
}