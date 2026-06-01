import java.util.Scanner;

class EvenOddChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int num = input.nextInt();

        if (num % 2 == 0) {
            System.out.print(num + " is Even");
        } else {
            System.out.print(num + " is Odd");
        }
    }
}