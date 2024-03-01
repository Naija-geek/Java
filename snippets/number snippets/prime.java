//Check if a number is prime:
public class prime {
    public static void main(String[] args) {
      int number = 11;
      boolean isPrime = true;
      if (number <= 1) {
        isPrime = false;
      } else {
        for (int i = 2; i <= Math.sqrt(number); i++) {
          if (number % i == 0) {
            isPrime = false;
            break;
          }
        }
      }
      System.out.println(number + " is " + (isPrime ? "prime" : "not prime"));
    }
  }