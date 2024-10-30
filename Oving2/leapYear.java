import static javax.swing.JOptionPane.*;

public class leapYear {
    public static void main(String[] args) {
        
        String year = showInputDialog("Input year:");

        if (Integer.parseInt(year) % 100 == 0) {
            if (Integer.parseInt(year) % 400 == 0) {
                showMessageDialog(null, "The year is a leap year");
            }

            else {
                showMessageDialog(null, "The year is not a leap year");
            }
        }

        else {
            if (Integer.parseInt(year) % 4 == 0) {
                showMessageDialog(null, "The year is a leap year");
            }

            else {
                showMessageDialog(null, "The year is not a leap year");
            }
        }
    }
}
