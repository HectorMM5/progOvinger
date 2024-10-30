public final class newString {
    private final String text;

    newString(String text) {
        this.text = text;
    }

    public newString shorten() {
        String[] words = this.text.split(" ");

        String shorted = "";

        for (int i = 0; i < words.length; i++) {
            shorted += words[i].charAt(0); 
        }

        return new newString(shorted);
    }
    
    public newString charOut(char character) {
        String out = "";

        for (int i = 0; i < this.text.length(); i++) {
            if (!(this.text.charAt(i) == character)) {
                out += this.text.charAt(i); 
            }
        }

        return new newString(out);

    }

    public static void main(String[] args) {
        newString string = new newString("AABCD ABCD ABCD");

        System.out.println(string.shorten().text);
        System.err.println(string.charOut('A').text);
    }

}
