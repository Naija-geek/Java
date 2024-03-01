//Find the average of an array of numbers:
public class average_of_an_array {
  public static void main(String[] args) {
    int[] numbers = {5, 8, 3, 10};
    double total = 0;
    for (int number : numbers) {
      total += number;
    }
    double average = total / numbers.length;
    System.out.println("The average of the array is: " + average);
  }
}