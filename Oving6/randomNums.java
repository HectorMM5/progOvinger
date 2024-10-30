import java.util.Random;

public class randomNums {
    public static void main(String[] args) {
        int[] counter = new int[10];
        Random randNum = new Random();

        String[] stars = new String[10];

        for (int i = 0; i < 1000; i++) {
            counter[randNum.nextInt(10)] += 1;
            
        }

        for (int i = 0; i < 10; i++) {
            stars[i] = "";
        }


        for (int i = 0; i < 10; i++) {
            int starsAmount = (int) Math.round(counter[i]/10);

            for (int j = 0; j < starsAmount; j++) {
                stars[i] += "*";
            }

            System.out.println(counter[i] + stars[i]);
        }
    }
}