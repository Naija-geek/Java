public class swap_two_numbers
{
      public static void main(String args[]){
          int number1=100,number2=200;
           
          System.out.println("Numbers before swapping:");
          System.out.println("number1: " + number1 +", number2: " +number2);
           
          //swap without using third variable
          number1=number1+number2;
          number2=number1-number2;
          number1=number1-number2;
 
          System.out.println("Numbers after swapping:");
          System.out.println("number1: " + number1 +", number2: " +number2);          
      }
}