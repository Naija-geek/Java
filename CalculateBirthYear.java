import javax.swing.JOptionPane;
import java.time.Year;
public class CalculateBirthYear {
    public static void main(String[] args) {
        // Input for the current age
        String ageString = JOptionPane.showInputDialog("Enter your current age:");
        int age = Integer.parseInt(ageString);

        // Get the current year
        int currentYear = Year.now().getValue();

        // Calculate the birth year
        int birthYear = currentYear - age;

        // Display the result using a JOptionPane message dialog
        JOptionPane.showMessageDialog(null, "Your birth year is: " + birthYear);
    }
}