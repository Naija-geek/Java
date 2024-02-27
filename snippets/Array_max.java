//Finds the maximum amount of Number in an ArrayList


public class Array_max {
    public static void main(String[] args) {
       int[] numbers = {10, 20, 30, 40, 50};
       int largest = numbers[0];
       for(int i = 1; i < numbers.length; i++) {
          if(numbers[i] > largest) {
             largest = numbers[i];
          }
       }
       System.out.println("Largest number is: " + largest);
    }
 }