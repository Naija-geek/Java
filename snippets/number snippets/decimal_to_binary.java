//Convert a number from decimal to binary:
public class decimal_to_binary {
    public static void main(String[] args) {
      int number = 25;
      String binary = "";
      while (number > 0) {
        binary = (number % 2) + binary;
        number /= 2;
      }
      System.out.println("The binary equivalent of " + number + " is: " + binary);
    }
  }