import javax.swing.JOptionPane;

public class timesTable {
    public static void main(String[] args) {
    
        int firstNum = Integer.parseInt(JOptionPane.showInputDialog("Input the first number."));

        int secondNum = Integer.parseInt(JOptionPane.showInputDialog("Input the second number."));


        for (int piece = 0; piece <= Math.abs(secondNum-firstNum); piece++) {

            if (secondNum-firstNum >= 0) {
                for (int count = 1; count <= 10; count++) {
                System.out.println(firstNum+piece + " * " + count + " = " + (firstNum+piece)*count);
                }
            }

            else {
                for (int count = 1; count <= 10; count++) {
                System.out.println(firstNum-piece + " * " + count + " = " + (firstNum-piece)*count);
                }
            }
        }
    }
}