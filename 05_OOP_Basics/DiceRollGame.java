import java.util.Scanner;

class DiceRollGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        char choice;
        int randValue, diceRolled = 0, sum = 0;

        do {
            randValue = (int) (Math.random() * 6) + 1;
            System.out.println("Random number: " + randValue);
            diceRolled++;
            sum += randValue;

            System.out.print("Do you want to roll again (Y/N)? ");
            choice = input.nextLine().charAt(0);

        } while (choice == 'y' || choice == 'Y');

        System.out.println("Total Score: " + sum);
        System.out.print("Dice rolled: " + diceRolled);
    }
}
