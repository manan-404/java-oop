import java.util.Scanner;

class FactorialCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to find its factorial: ");
        int num = input.nextInt();

        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        System.out.print("Factorial of " + num + " is: " + factorial);
    }
}