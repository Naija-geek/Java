//import javax.swing.JOptionPane;
import java.util.Scanner;
public class Greetings
{
  public static void main(String[] args)
  {
    int a,b,c;
    try (Scanner input = new Scanner(System.in)) {
      /*
       * String t = JOptionPane.showInputDialog(null,"Enter the first value");
      a = Integer.parseInt(t);
      t = JOptionPane.showInputDialog(null,"Enter the second value");
      b = Integer.parseInt(t);
      JOptionPane.showMessageDialog(null,"The sum = " + (a+b));
      
      */
      System.out.println("Enter the first value:");
      a = input.nextInt();
      System.out.print("Enter the second value:");
      b = input.nextInt();
    }
    System.out.println("The sum of " + a + " and " + b + " = "  + (a+b));
  }
}