import java.util.Scanner;

class CaseConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = input.nextLine();

        System.out.println("Uppercase: " + sentence.toUpperCase());
        System.out.print("Lowercase: " + sentence.toLowerCase());
    }
}