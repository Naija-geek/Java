import java.util.Scanner;
public class Trapezium
{
  public static void main(String... lawrence)
  {
    float l1,l2,h,
      a;
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the values of l1, l2, h:");
    l1 = input.nextFloat();
    l2 = input.nextFloat();
    h = input.nextFloat();
    a = (float)(1.0/2*(l1+l2)*h);
    System.out.println("The area = " + a );
  }
}
