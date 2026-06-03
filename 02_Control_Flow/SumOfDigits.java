import java.util.Scanner;

class SumOfDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        int num = input.nextInt();

        if (num >= 0) {
            int total = 0;
            while (num > 0) {
                total += num % 10;
                num /= 10;
            }
            System.out.print("Sum of digits: " + total);
        } else {
            System.out.print("Please enter a positive integer");
        }
    }
}
