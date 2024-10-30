import javax.swing.JOptionPane;

public class lokker {
    public static void main(String[] args) {
        
        for (int counter = 0; counter < 10; counter++) {
            System.out.println("En gang");
        }

        int studentAmount;

        do {
            studentAmount = Integer.parseInt(JOptionPane.showInputDialog("Input student amount:"));

            
        } while (studentAmount < 0 || studentAmount > 30);

        int random = 10;
        int current = 1;

        while (current != random) {



            if (current == 5) {
                break;
            }

            else if (current == 2) {
                System.err.println("Number2");
                current += 2;
                continue;
            }

            else if (current < 10) {
                current++;
            } 

            System.out.println(current);

            
        }

        System.out.println(current);

    }
}