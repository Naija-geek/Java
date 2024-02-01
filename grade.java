import java.util.Scanner;
public class grade {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int s;
        System.out.println("Enter your score:");
        s = sc.nextInt();
        if(s>=70)System.out.println("Your grade is A");
        else if(s>=60 && s<70)System.out.println("Your grade is B");
        else if(s>=50 && s<60)System.out.println("Your grade is C");
        else if(s>=45 && s<50)System.out.println("Your grade is D");
        else if(s>=40 && s<40)System.out.println("Your grade is E");
        else if(s>=0)System.out.println("Your grade is F");
        else System.out.println("invalid score");
}
