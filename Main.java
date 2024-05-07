import javax.swing.*;
import java.text.DecimalFormat;

/**
 * @author Anuar Orozco
 * A simple program to evaluate whether a student's status is approved, regular, or failed.
 */

public class Main {

    public static void main(String[] args) {

        DecimalFormat df = new DecimalFormat("#.##");

        double g1 = Double.parseDouble(JOptionPane.showInputDialog("Enter the first grade"));
        double g2 = Double.parseDouble(JOptionPane.showInputDialog("Enter the second grade"));
        double g3 = Double.parseDouble(JOptionPane.showInputDialog("Enter the third grade"));

        double GPA = (g1 + g2 + g3) / 3;

        if (GPA >= 7) {
            JOptionPane.showMessageDialog(null, "The GPA is: " + df.format(GPA) + ". Status: APPROVED!");
        } else if (GPA >= 4) {
            JOptionPane.showMessageDialog(null, "The GPA is: " + df.format(GPA) + ". Status: REGULAR!");
        } else {
            JOptionPane.showMessageDialog(null, "The GPA is: " + df.format(GPA) + ". Status: FAILED!");
        }
    }
}
