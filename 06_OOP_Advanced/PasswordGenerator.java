import java.util.Scanner;

class PasswordGenerator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        char[] lowercase = new char[26];
        char letter = 'a';
        for (int i = 0; i < 26; i++) {
            lowercase[i] = letter++;
        }

        char[] digits = new char[10];
        char digit = '0';
        for (int i = 0; i < 10; i++) {
            digits[i] = digit++;
        }

        char[] specialChars = {'!', '@', '#', '$', '%', '^', '&', '*'};

        System.out.print("Enter desired password length: ");
        int size = input.nextInt();

        char[] password = new char[size];
        for (int i = 0; i < size; i++) {
            int category = (int) (Math.random() * 4) + 1;
            switch (category) {
                case 1:
                    password[i] = lowercase[(int) (Math.random() * 26)];
                    break;
                case 2:
                    password[i] = digits[(int) (Math.random() * 10)];
                    break;
                case 3:
                    password[i] = specialChars[(int) (Math.random() * 8)];
                    break;
                case 4:
                    password[i] = Character.toUpperCase(lowercase[(int) (Math.random() * 26)]);
                    break;
            }
        }

        System.out.print("Generated password: ");
        for (char c : password) {
            System.out.print(c);
        }
    }
}
