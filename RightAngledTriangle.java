import javax.swing.JOptionPane;
public class RightAngledTriangle {
    public static void main(String[] args) {
        // Input for the length of side 'a'
        String aValue = JOptionPane.showInputDialog("Enter the length of side 'a':");
        double a = Double.parseDouble(aValue);

        // Input for the length of side 'b'
        String bValue = JOptionPane.showInputDialog("Enter the length of side 'b':");
        double b = Double.parseDouble(bValue);

        // Calculate the hypotenuse 'C'
        double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));

        // Display the result using a JOptionPane message dialog
        JOptionPane.showMessageDialog(null, "The length of the hypotenuse 'C' is: " + c);
    }
}