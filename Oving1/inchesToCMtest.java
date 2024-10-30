public class inchesToCMtest {
    public static void main(String[] args) {
        
        
        final double INCHES_CM_RATIO = 2.54; //Setter opp et forholdstall som senere ganges inn
        

        int[] inches = {2, 5, 6, 1}; //Deklarerer en liste, datasettet


        for (int i = 0; i < inches.length; i++) { //For hver objekt i lista
            System.out.println( inches[i] + " tommer tilsvarer " +  inches[i]*INCHES_CM_RATIO + " centimeter."); //Skriver ut resultatet
        }
    }
}
