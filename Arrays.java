import java.util.Scanner;
public class Arrays {
    public static void main(String[] args)
    //integer.parseint//
    // Alternative int A = new int[5]; 
    {
        // int [] A;
        // A = new int[5]; 
        // A [0] = 6;
        // A [1] = 12;
        // A [2] = 6;
        // A [3] = 5;
        // A [4] = 3;
        Scanner x = new Scanner (System.in);
        System.out.println("How many numbers do you have ?");
        int v = x.nextInt();
        int [] A = new int [v];
        //variance
        int sum = 0;
        for (int i =0; i<v; i++){
            System.out.println("Enter element" + (i+1));
            A[i] = x.nextInt();
            sum += A[i];
        }
        double mean = (double) sum/v;
        //Standard deviation
        double sum2 = 0;
        for (int i = 0; i <v; i++){
            sum2 = Math.pow(A[i]-mean,2);
        }
        double sd = Math.sqrt(sum2/v);
        System.out.println("The standard deviation = " + sd);
                //for (int i = 0; i <v; i++)System.out.println(A[i]);
        // System.out.println(A[0]);
        // System.out.println(A[1]);
        // System.out.println(A[2]);
        // System.out.println(A[3]);
        // System.out.println(A[4]);
    }
    
}
Assignment
Write a java program to store the names of student in csc 300 level.
your program will accept a surname  and search through the array for the fullname, we are search by surname. Check by the surname to know if it exist.
prepare array for string (use readline) go over the array and use split method to split space and pick the one at index 0 and check if it exists.
