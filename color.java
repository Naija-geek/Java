import java.util.Scanner;
public class color {
    public static void main(String[] args) {
          try (Scanner sc = new Scanner(System.in)) {
            int s;
            System.out.println("Enter your character:");
            s = sc.nextInt(0);

            if(s== 'R' || s=='r')System.out.println("Hurray! that is Red. You won!!!");
            else if(s=='O' || s=='o')System.out.println("hurray! that is Orange. You won!!!");
            else if(s=='Y' || s=='y')System.out.println("hurray! that is Yellow. You won!!!");
            else if(s=='G' || s=='g')System.out.println("hurray! that is Green. You won!!!");
            else if(s=='B' || s=='b')System.out.println("hurray! that is Blue. You won!!!");
            else if(s=='I' || s=='i')System.out.println("hurray! that is Indigo. You won!!!"); 
            else if(s=='V' || s=='v')System.out.println("hurray! that is Violet. You won!!!");
            else System.out.println("oops....try again" );
        }
    
    /*
     * Switch(s)
     * {
     * case "R", 'r' :System.out.println("Hurray! that is Red color, You won!!!");break;
     * case "O", 'o' :System.out.println("Hurray! that is Orange color, You won!!!");break;
     * case "G", 'g' :System.out.println("Hurray! that is Green color, You won!!!");break;
     * case "B", 'b' :System.out.println("Hurray! that is Blue color, You won!!!");break;
     * case "I", 'i' :System.out.println("Hurray! that is Indigo color, You won!!!");break;
     * case "V", 'v' :System.out.println("Hurray! that is Violet color, You won!!!");break;
     * default:System.out.println("oops.....try again" );
     * }
     */
}
    }
  
