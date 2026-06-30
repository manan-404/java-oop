import java.util.InputMismatchException;
import java.util.Scanner;

class ExceptionPropagationDemo {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            try {
                int value = getInput();
                System.out.println("Valid integer entered: " + value);
                break;
            } catch (InputMismatchException e) {
                System.out.println("Error: That was not an integer. Try again.\n");
                input.nextLine(); // clear invalid input
            }
        }
    }

    // throws — declares that this method may throw InputMismatchException
    // instead of handling it here, it propagates up to whoever called this method
    static int getInput() throws InputMismatchException {
        System.out.print("Enter a valid integer: ");
        return input.nextInt();
    }
}
