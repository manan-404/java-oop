import java.util.Scanner;

class IntegerInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any integer value: ");
        int x = input.nextInt();
        System.out.print("Value you entered is: " + x);
    }
}