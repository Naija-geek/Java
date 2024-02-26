public class Access_modifier {

  private int privateVariable = 10; // Only accessible within this class
  int defaultVariable = 20; // Accessible within the package
  protected int protectedVariable = 30; // Accessible within the package and subclasses
  public int publicVariable = 40; // Accessible from anywhere

  public void printVariables() {
    System.out.println("Private: " + privateVariable);
    System.out.println("Default:"   + defaultVariable);
  }
}