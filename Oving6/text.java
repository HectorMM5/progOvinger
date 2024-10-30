import java.util.ArrayList;
import java.util.Scanner;

public class text {
    public class textAnalysis {
        private String text;
        private int[] characterAmount;
        private int textLength;
        public String abc = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        

        public textAnalysis(String text) {
            this.characterAmount = new int[27]; 
            this.text = text;
            this.textLength = this.text.length();

            for (int i = 0; i < this.textLength; i++) {
                char currentChar = Character.toUpperCase(this.text.charAt(i));
                int index = abc.indexOf(currentChar);
                if (index != -1) {
                    characterAmount[index] += 1; 
                } else {
                    characterAmount[26] += 1;
                }
            }
        }

        public int findLetters() {
            int count = 0;
            for (int i = 0; i < this.characterAmount.length-1; i++) {
                if (characterAmount[i] != 0) {
                    count += 1;
                }
            }

            return count;
        }

        public int countLetters() {
            int count = 0;
            for (int i = 0; i < this.characterAmount.length-1; i++) {
                count += characterAmount[i];
            }

            return count;
        }

        public double calculatePercentage() {

            return ((double) characterAmount[characterAmount.length-1]/ this.text.length());
        }

        public int findLetterInstances(String letter) {
            int characterIndex = 0;
            for (int j = 0; j < abc.length(); j++) {
                if (letter.equalsIgnoreCase(Character.toString(abc.charAt(j)))) {
                    characterIndex = j;
                    break;
                }
            }

            return (characterAmount[characterIndex]);

        }

        public char[] commonLetter() {
            boolean changeDone = true;
            int currentVal = 0;

            while (changeDone) {
                changeDone = false;

                for (int i = 0; i < characterAmount.length - 1; i++) { 
                    if (characterAmount[i] > currentVal) {
                        currentVal = characterAmount[i];
                        changeDone = true;
                    }
                }
            }

            ArrayList<Character> charList = new ArrayList<>();

            for (int i = 0; i < characterAmount.length - 1; i++) { 
                if (characterAmount[i] == currentVal) {
                    charList.add(abc.charAt(i)); 
                }
            }

            char[] resultArray = new char[charList.size()];
            for (int i = 0; i < charList.size(); i++) {
                resultArray[i] = charList.get(i);
            }

            return resultArray;
        }
    }

    public static void main(String[] args) {
        text text = new text();
        Scanner scanner = new Scanner(System.in);

            while (true) {

            System.out.println("\nSkriv inn teksten din:");
            textAnalysis text2 = text.new textAnalysis(scanner.nextLine());

            if ("stop".equals(text2.text)) {
                break;
            }

            System.out.println("Antall unike bokstaver i teksten: " + text2.findLetters());

            System.out.println("Antall bokstaver i teksten (uten spesialtegn): " + text2.countLetters());
            double nonLetterPercentage = text2.calculatePercentage();
            System.out.printf("Prosent av spesialtegn i teksten: %.2f%%\n", nonLetterPercentage * 100);


            System.out.println("Skriv inn en bokstav for å finne antall forekomster:");
            String letter = scanner.nextLine();
            System.out.println("Antall forekomster av bokstaven '" + letter + "': " + text2.findLetterInstances(letter));

            char[] commonLetters = text2.commonLetter();
            System.out.print("Den/de mest vanlige bokstaven(e) i teksten er: ");
            for (char c : commonLetters) {
                System.out.print(c + " ");
            }

        }
    }

}