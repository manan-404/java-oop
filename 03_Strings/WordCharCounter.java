import java.util.Scanner;

class WordCharCounter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = input.trim();
        sentence = input.nextLine();

        int words = 1, chars = 0;
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == ' ') {
                words++;
            } else {
                chars++;
            }
        }
        System.out.println("Total words: " + words);
        System.out.print("Total characters (no spaces): " + chars);
    }
}