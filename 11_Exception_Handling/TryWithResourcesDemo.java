import java.util.Scanner;

class TryWithResourcesDemo {
    public static void main(String[] args) {
        // Old way — manual closing required in finally
        Scanner oldScanner = new Scanner(System.in);
        try {
            System.out.print("Enter your name (old way): ");
            String name = oldScanner.nextLine();
            System.out.println("Hello, " + name);
        } finally {
            oldScanner.close(); // must remember to close manually
        }

        // Modern way — try-with-resources auto-closes the Scanner
        try (Scanner newScanner = new Scanner(System.in)) {
            System.out.print("Enter your favorite number (new way): ");
            int number = newScanner.nextInt();
            System.out.println("Nice, " + number + " is a great number!");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        // newScanner is automatically closed here — no need for finally
    }
}
