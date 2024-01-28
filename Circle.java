import java.util.Scanner;
public class Circle
{
  public static void main(String[] lawrence)
  {
    float radius,area;
    System.out.println(lawrence[0]);
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the radius: ");
    radius = sc.nextFloat();
    area = (float)(Math.PI * Math.pow(radius,2));
    
    System.out.println("The area = " + area);
    
    float circumference = (float)(2*22.0/7*radius);//2*Math.PI*radius
    System.out.println("The circumference = " + circumference);
  }
}