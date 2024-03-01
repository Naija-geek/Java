import java.util.Scanner;
public class Palindrome{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any string to check for Palindrome");
        String userinput = input.next();
        boolean mismatch = false;
        for (int i = 0; i < userinput.length();i++) 
        {
            if(userinput.charAt(1) !=userinput.charAt(userinput.length()- 1-i));{
                mismatch = true;
                break;
            }
    }
    if(mismatch)System.out.println(userinput + " is not a Palindrome");
    else System.out.println(userinput + " is a Palindrome");
    }
}