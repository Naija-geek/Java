

public class String_Manipulation {

  public static void main(String[] args) {
    String name = "John Doe";
    String upperCaseName = name.toUpperCase();
    String lowerCaseName = name.toLowerCase();
    int length = name.length();
    System.out.println("Original: " + name);
    System.out.println("Uppercase: " + upperCaseName);
    System.out.println("Lowercase: " + lowerCaseName);
    System.out.println("Length: " + length);
  }
}