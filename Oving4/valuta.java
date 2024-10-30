import javax.swing.JOptionPane;

public class valuta {
    public class coin {
        public String name;
        public double value;

        public coin(String name, double value) {
            this.name = name;
            this.value = value;
        }

        public double calculateToNOK(double inputToNOK) {
            return (inputToNOK*value);
        }

        public double calculateFromNOK(double inputFromNOK) {
            return (inputFromNOK/value);
        }


    }

    public static void main(String[] args) {
        valuta Valuta = new valuta();
        coin dollar = Valuta.new coin("Dollar", 10.83);
        coin euro = Valuta.new coin("Euro", 11.95);
        coin svk = Valuta.new coin("Svensk krone", 1.044);
    
        int inputCoin = Integer.parseInt(JOptionPane.showInputDialog("Sjekk utenlandsk valuta i dag. Skriv 1 for dollar, 2 for euro eller 3 for svenske kroner. Skriv 4 for avslutt."));

        switch (inputCoin) {
            case 1 ->                 {
                    float inputNOK = Float.parseFloat(JOptionPane.showInputDialog("En " + dollar.name + " er verdt " + dollar.value + " kroner i dag. Hvor mange  " + dollar.name + " skal omgjores?"));
                    System.out.println(dollar.calculateToNOK(inputNOK));
                }
            case 2 ->                 {
                    float inputNOK = Float.parseFloat(JOptionPane.showInputDialog("En " + euro.name + " er verdt " + euro.value + " kroner i dag. Hvor mange " + euro.name + " skal omgjores?"));
                    System.out.println(euro.calculateToNOK(inputNOK));
                }
            case 3 ->                 {
                    float inputNOK = Float.parseFloat(JOptionPane.showInputDialog("En " + svk.name + " er verdt " + svk.value + " kroner i dag. Hvor mange " + svk.name + " skal omgjores?"));
                    System.out.println(svk.calculateToNOK(inputNOK));
                }
            default -> {
            }
        }
    
    }


}