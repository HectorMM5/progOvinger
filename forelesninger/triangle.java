

public class triangle {
    public static void main(String[] args) {

        String currentString = "*";

        for (int counter = 1; counter<=5; counter++) {
            System.out.println(currentString);

            currentString += "*";


        }


        String currentStars = "";
        String currentSpaces = "      ";




        for (int counter = 1; counter<=5; counter++) {
            

            currentStars += "**";
            int negativeSpaces = 1;

            if (currentSpaces.length() > 0) {
                currentSpaces = currentSpaces.substring(0, currentSpaces.length() - negativeSpaces);
            }
            
            System.out.println(currentSpaces + currentStars);
        
            


        }



        
    }
}