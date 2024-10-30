public class renter {
    public static void main(String[] args) {
        //Oppg. A

        float price = 17600f;
        float paid = 0f;

        int monthly = 550;
        float interest = 0.075f;
        int currentMonth = 0;

        while (paid < price) {
            paid += monthly;
            paid = paid*(1+(interest/12));
            currentMonth++;

            price = price * (1+(interest/12));
        }

        System.out.println("Din total innbetaling er " + Math.floor(monthly*currentMonth) + "kr.");
        System.out.println("Prisen har vokst til " + Math.floor(price) + "kr.");
        System.out.println("Det tar " + currentMonth + " maneder a fullfore kjopet med denne planen.");

    }



}