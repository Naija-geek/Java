//Find the greatest common divisor (GCD) of two numbers:
public class GCD {
  public static void main(String[] args) {
    int num1 = 18, num2 = 12;
    while (num2 != 0) {
      int temp = num1 % num2;
      num1 = num2;
      num2 = temp;
    }
    System.out.println("The GCD of " + num1 + " and " + num2 + " is: " + num1);
  }
}