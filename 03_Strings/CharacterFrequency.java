import java.util.Scanner;

class CharacterFrequency {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = input.nextLine();
        System.out.print("Enter a character to find: ");
        char toFind = input.nextLine().charAt(0);

        int count = 0;
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == toFind) {
                count++;
            }
        }
        System.out.print("'" + toFind + "' appears "+ count + " time(s)");
    }
}