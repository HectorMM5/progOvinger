import static javax.swing.JOptionPane.*;

public class secondsToTime {
    public static void main(String[] args) {
        
        String input = showInputDialog("Oppgi tiden i sekunder:");

        int i = 1;
        while ((Integer.parseInt(input)/(i*3600)) >= 1) {
            i++;
        }
        final int hours = i-1;

        i = 1;
         while (((Integer.parseInt(input)-(hours*3600))/(i*60)) >= 1) {
            i++;
        }
        final int minutes = i-1;

        final int seconds = Integer.parseInt(input) - (hours*3600) - (minutes*60);


        System.out.println("Den oppgitte tiden tilsvarer " + hours + " timer, " + minutes + " minutter, og " + seconds + " sekunder.");
    }
}