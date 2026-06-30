class FinallyBlockDemo {
    public static void main(String[] args) {
        System.out.println("=== Case 1: No exception ===");
        divide(10, 2);

        System.out.println("\n=== Case 2: Exception occurs ===");
        divide(10, 0);

        System.out.println("\n=== Case 3: finally runs even with return ===");
        System.out.println("Result: " + safeDivide(20, 4));
    }

    static void divide(int a, int b) {
        try {
            int result = a / b;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        } finally {
            System.out.println("Finally block executed — runs no matter what.");
        }
    }

    static int safeDivide(int a, int b) {
        try {
            return a / b; // even though we return here...
        } finally {
            System.out.println("Finally still runs before the value is returned.");
        }
    }
}
