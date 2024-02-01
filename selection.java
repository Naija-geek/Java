import java.util.Scanner;
public class selection {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int num;
        System.out.println("Enter any value:");
        num = s.nextInt();
        If (num<0)System.out.println(num+ " is a negative number");
        else System.out.println(num + " is a positive number");

    }
}
