import java.util.Scanner;

class RecursivePrimeChecker {
    int userInput;
    int divisorCount = 0;

    void checkDivisors(int number) {
        if (number > 0) {
            if (userInput % number == 0) {
                divisorCount++;
            }
            checkDivisors(number - 1);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        RecursivePrimeChecker checker = new RecursivePrimeChecker();

        System.out.print("Enter a positive number: ");
        checker.userInput = input.nextInt();

        checker.checkDivisors(checker.userInput);

        if (checker.divisorCount == 2) {
            System.out.print(checker.userInput + " is prime");
        } else {
            System.out.print(checker.userInput + " is NOT prime");
        }
    }
}
