import java.util.Scanner;

class AgeCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final int CURRENT_YEAR = 2026;

        System.out.print("Enter the year you were born: ");
        int bornYear = input.nextInt();

        int age = CURRENT_YEAR - bornYear;
        System.out.print("Your age is: " + age);
    }
}
