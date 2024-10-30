public class meat {
    public static void main(String[] args) {
        
        double costA = 35.9/450;

        double costB = 39.5/500;


        double pricePerKgA = costA*1000;
        double pricePerKgB = costB*1000;

        if (pricePerKgA == pricePerKgB) {
            System.out.println("Prisen er den samme.");
        }

        else if (pricePerKgA > pricePerKgB) {
            System.out.println("Tilbud A er billigere.");
        }

        else {
            System.out.println("Tilbud B er billigere.");
        }
    }
}