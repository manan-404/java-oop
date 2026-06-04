import java.util.Scanner;

class MenuCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Select an operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.print("Enter your choice (1-4): ");
        int choice = input.nextInt();

        System.out.print("Enter two numbers: ");
        double a = input.nextDouble();
        double b = input.nextDouble();

        switch (choice) {
            case 1:
                System.out.print("Result: " + (a + b));
                break;
            case 2:
                System.out.print("Result: " + (a - b));
                break;
            case 3:
                System.out.print("Result: " + (a * b));
                break;
            case 4:
                if (b != 0) {
                    System.out.print("Result: " + (a / b));
                } else {
                    System.out.print("Cannot divide by zero");
                }
                break;
            default:
                System.out.print("Invalid choice");
        }
    }
}