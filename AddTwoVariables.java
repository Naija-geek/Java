import javax.swing.JOptionPane;
public class AddTwoVariables {
    public static void main(String[] args) {
        // Input for the first number
        String num1String = JOptionPane.showInputDialog("Enter the first number:");
        double num1 = Double.parseDouble(num1String);

        // Input for the second number
        String num2String = JOptionPane.showInputDialog("Enter the second number:");
        double num2 = Double.parseDouble(num2String);

        // Calculate the sum
        double sum = num1 + num2;

        // Display the result using a JOptionPane message dialog
        JOptionPane.showMessageDialog(null, "The sum of the two numbers is: " + sum);
    }
}