//Calculate the sum of digits of a number:
public class sum_of_digits {
  public static void main(String[] args) {
    int number = 1234;
    int sum = 0;
    while (number > 0) {
      sum += number % 10;
      number /= 10;
    }
    System.out.println("The sum of digits of " + number + " is: " + sum);
  }
}