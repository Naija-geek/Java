import java.util.Scanner;
public class Roots
{
  public static void main(String[] args)
  {
    double a,b,c,x1,x2;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the value of a: ");
    a = sc.nextDouble();
    System.out.println("Enter the value of b: ");
    b = sc.nextDouble();
    System.out.println("Enter the value of c: ");
    c = sc.nextDouble();
    if(b*b>=4*a*c){
      x1 = (-b + Math.sqrt(b*b-4*a*c))/(2*a);
      x2 = (-b - Math.sqrt(b*b-4*a*c))/(2*a);
      System.out.println("X1 = " + x1 + "\t X2 = " + x2);
    }
    else{
      double realpart = (-b)/(2*a);
      double imaginarypart = Math.sqrt(-(b*b-4*a*c))/(2*a);
      System.out.println("X1 = " + realpart + "+" + imaginarypart + "i");
      System.out.println("X2 = " + realpart + "-" + imaginarypart + "i");
    }
  }
}