import java.util.Scanner;

class InvalidAgeException extends Exception {
    InvalidAgeException(String message) {
        super(message);
    }
}

class InvalidNameException extends Exception {
    InvalidNameException(String message) {
        super(message);
    }
}

class MultipleCustomExceptions {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            registerUser();
        } catch (InvalidAgeException | InvalidNameException e) {
            System.out.println("Registration failed: " + e.getMessage());
        }
    }

    static void registerUser() throws InvalidAgeException, InvalidNameException {
        System.out.print("Enter name: ");
        String name = input.nextLine();

        if (name.trim().isEmpty()) {
            throw new InvalidNameException("Name cannot be empty.");
        }

        System.out.print("Enter age: ");
        int age = input.nextInt();

        if (age < 0 || age > 120) {
            throw new InvalidAgeException("Age must be between 0 and 120.");
        }

        System.out.println("Registration successful for " + name + ", age " + age);
    }
}
