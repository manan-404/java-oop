import java.util.Scanner;

class VowelOrConsonant {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a letter: ");
        char letter = input.nextLine().charAt(0);

        switch (letter) {
            case 'a': case 'A':
            case 'e': case 'E':
            case 'i': case 'I':
            case 'o': case 'O':
            case 'u': case 'U':
                System.out.print(letter + " is a Vowel");
                break;
            default:
                System.out.print(letter + " is a Consonant");
        }
    }
}