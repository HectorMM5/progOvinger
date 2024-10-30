public class textManipulation {
    private String text;

    public textManipulation(String text) {
        this.text = text;
    }

    public int countWords() {
        return this.text.split(" ").length;
    }

    public double averageWordLength() {
        String[] words = this.text.split(" ");

        String word = "";

        char[] separators = {'.', ':', '?', '!', ' ', ','};

        double sumLetters = 0;

        boolean isSeparator = false;

        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words[i].length(); j++) {
                isSeparator = false;

                for (int k = 0; k < separators.length; k++) {
                    if (words[i].charAt(j) == separators[k]) {
                        isSeparator = true;
                        break;
                    }
                }

                if (!isSeparator) {
                    word += words[i].charAt(j);
                }
                
                
            }

            words[i] = word;
            word = "";
            
            sumLetters += words[i].length();
        }

        sumLetters = sumLetters/words.length;
        return sumLetters;
    }

    public double averageWordsPerSentence() {
        String[] sentences = this.text.split("[.!?:]");

        double totalWords = 0;
        int sentenceCount = 0;

        for (int i = 0; i < sentences.length; i++) {
            String sentence = sentences[i].trim();

            String[] words = sentence.split(" ");

            if (words.length > 0 && !sentence.isEmpty()) {
                totalWords += words.length;
                sentenceCount++;
            }
        }

        return totalWords / sentenceCount;

    }

    public String replaceWord(String find, String replace) {
        String textReplaced = this.text.replace(find, replace);

        return textReplaced;

    }

    public String getText() {
        return this.text;
    }

    public String uppercaseText() {
        return this.text.toUpperCase();
    }


    public static void main(String[] args) {
        textManipulation tm = new textManipulation("Godkjenning av øvinger: Øvinger godkjennes av veileder på lab-timer. Frist for godkjenning er labbtimen uka etter øvingen er satt opp på planen.");

        System.out.println("Word count: " + tm.countWords());

        System.out.println("Average word length: " + tm.averageWordLength());

        System.out.println("Average words per sentence: " + tm.averageWordsPerSentence());

        System.out.println("Text after replacing 'test' with 'example': " + tm.replaceWord("test", "example"));

        System.out.println("Original text: " + tm.getText());

        System.out.println("Uppercase text: " + tm.uppercaseText());
    }
    
}