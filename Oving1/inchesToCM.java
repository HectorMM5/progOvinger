import static javax.swing.JOptionPane.*;


public class inchesToCM {
    public static void main(String[] args) {
        final double INCHES_CM_RATIO = 2.54; //Setter opp et forholdstall som senere ganges inn
        
        String inchInput = showInputDialog("Antall tommer:"); //Ber om input fra brukeren


        double inches = Double.parseDouble(inchInput); //Transformerer datatypen fra string til double
        
        System.out.println(inches + " tommer tilsvarer " +  inches*INCHES_CM_RATIO + " centimeter."); //Skriver ut verdien

    }
}


