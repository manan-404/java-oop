import java.util.Scanner;

class UnknownOperatorException extends Exception {
    UnknownOperatorException(String operator) {
        super("'" + operator + "' is an unknown operator.");
    }
}

class CustomExceptionCalculator {
    static double result = 0.0;
    static boolean endFlag = false;
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            try {
                calculate();
            } catch (UnknownOperatorException e) {
                System.out.println("Error: " + e.getMessage());
                continue;
            }
            if (endFlag) break;
        }
    }

    static void calculate() throws UnknownOperatorException {
        System.out.println("Current result: " + result);
        System.out.print("Enter operation and number (e.g. + 5) or 'r' to finish: ");
        String userInput = input.nextLine().trim();

        if (userInput.equalsIgnoreCase("r")) {
            System.out.println("Final result: " + result);
            endFlag = true;
            return;
        }

        if (!userInput.contains(" ")) {
            System.out.println("Invalid format. Use: <operator> <number>");
            return;
        }

        String[] parts = userInput.split(" ");
        String operator = parts[0];

        if (!operator.equals("+") && !operator.equals("-") &&
            !operator.equals("*") && !operator.equals("/")) {
            throw new UnknownOperatorException(operator);
        }

        double number = Double.parseDouble(parts[1]);

        switch (operator) {
            case "+": result += number; break;
            case "-": result -= number; break;
            case "*": result *= number; break;
            case "/": result /= number; break;
        }

        System.out.println("Result after " + operator + " " + number + " = " + result);
    }
}
