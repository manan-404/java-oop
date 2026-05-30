import java.util.Scanner;

class StringInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your full name: ");
        String name = input.nextLine();

        System.out.print("Enter your city: ");
        String city = input.nextLine();

        System.out.println("Name: " + name);
        System.out.print("City: " + city);
    }
}