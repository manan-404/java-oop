import java.util.Scanner;

class UsernameValidator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a username: ");
        String username = input.nextLine();

        if (username.isEmpty()) {
            System.out.print("Username cannot be empty");
        } else if (username.contains(" ")) {
            System.out.print("Username cannot contain spaces");
        } else if (username.length() < 5) {
            System.out.print("Username too short. Minimum 5 characters");
        } else if (username.length() > 15) {
            System.out.print("Username too long. Maximum 15 characters");
        } else {
            System.out.print("Valid username: " + username);
        }
    }
}