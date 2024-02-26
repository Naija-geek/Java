//Generate random numbers within a range:
import java.util.Random;

public class range {
  public static void main(String[] args) {
    Random random = new Random();
    int min = 10, max = 50;
    int randomNumber = random.nextInt(max - min + 1) + min;
    System.out.println("Random number between " + min + " and " + max + ": " + randomNumber);
  }
}