import static javax.swing.JOptionPane.*;

public class timeInSeconds {
    public static void main(String[] args) {
        
        String input = showInputDialog("Oppgi tiden, separert med komma (Timer, minutter, sekunder)");

        String[] time = input.split(",");

        int totalSeconds = Integer.parseInt(time[0])*3600 + Integer.parseInt(time[1])*60 + Integer.parseInt(time[2]);

        System.out.println("Den oppgitte tiden tilsvarer " + totalSeconds + " sekunder.");
    }
}
