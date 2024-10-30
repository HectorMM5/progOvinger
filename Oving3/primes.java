import javax.swing.JOptionPane;

public class primes {
    public static void main(String[] args) {
    
        String input = JOptionPane.showInputDialog("Skriv inn et tall:");
        boolean foundNum = false;
        int number = 0;
        boolean validInput = false;

        while (!validInput) {
            try {
                number = Integer.parseInt(input);
                validInput = true;
            
            } catch (NumberFormatException e) {
                input = JOptionPane.showInputDialog("Det er ikke et gyldig tall. Vennligst skriv inn et heltall:");
            }
        }

        if (number < 2) {
            System.out.println("Tallet er ikke et primtall");
        }

        else {
            for (int i = 2; i <= number-1; i++) {
                if (number % i == 0) {
                    foundNum = true;
                    break;
                }
            }

            if (foundNum == true) {
                System.out.println("Tallet er ikke et primtall");
            }

            else {
                System.out.println("Tallet er et primtall");
            }

        }
        
    

    }
}