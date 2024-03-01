import java.util.Scanner;
public class select {
    public static void main(String[] args) {
        System.out.println("What is your name?");
        try (//type identifier = new type();
        Scanner scanner = new Scanner(System.in)) {
            String name = scanner.nextLine();

            System.out.println("Hello " + name);
        }
    }
}