// public class StringTest {
//     public static void main(String []args) {
//         String name = "Lawrence";
//         String greetings = "Welcome to FUOYE";
//         System.out.println(name.length());
//         System.out.println(greetings.length());
//     }
// }
//Word occurence program with java
// import java.util.Scanner;
// public class StringTest{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a sentence");
//         String sen = sc.nextLine();
//         String[] word = sen.split("");
//         int count = 0;
//         for(String w: word) {
//             if (w.equalsIgnoreCase("the")) count++;
//     }
//     System.out.println(count);
// }
// }

import java.util.Scanner;
 public class StringTest{
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String sen = sc.next();
        String name_prefix = sen.substring(0,3);
        if(name_prefix.equals("Ade"))System.out.println("Your royal highness");
        else System.out.println("Hello");
        System.out.println(sen.length());
    }
}