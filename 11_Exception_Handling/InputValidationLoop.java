import java.util.InputMismatchException;
import java.util.Scanner;

class InputValidationLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("Enter first integer: ");
                int n1 = input.nextInt();
                System.out.print("Enter second integer: ");
                int n2 = input.nextInt();

                double result = (double) n1 / n2;
                System.out.println("Result: " + result);
                break;

            } catch (ArithmeticException e) {
                System.out.println("Error: Cannot divide by zero. Try again.\n");
            } catch (InputMismatchException e) {
                System.out.println("Error: Please enter integers only. Try again.\n");
                input.nextLine(); // clear invalid input from scanner buffer
            }
        }
    }
}
