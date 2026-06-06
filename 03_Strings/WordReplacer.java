import java.util.Scanner;

class WordReplacer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = input.nextLine();

        System.out.print("Enter the word to replace: ");
        String toReplace = input.nextLine();

        if (sentence.contains(toReplace)) {
            System.out.print("Enter the replacement word: ");
            String replaceWith = input.nextLine();
            System.out.println("Original:  " + sentence);
            System.out.print("Updated:   " + sentence.replace(toReplace, replaceWith));
        } else {
            System.out.print("\"" + toReplace + "\" not found in the sentence");
        }
    }
}