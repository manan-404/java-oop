import java.util.Scanner;

class PrimeNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the limit: ");
        int limit = input.nextInt();

        while (limit <= 0) {
            System.out.print("Invalid input. Enter a positive number: ");
            limit = input.nextInt();
        }

        System.out.print("Prime numbers up to " + limit + ": ");
        for (int j = 2; j <= limit; j++) {
            int count = 0;
            for (int i = 1; i <= j; i++) {
                if (j % i == 0) count++;
            }
            if (count == 2) {
                System.out.print(j + " ");
            }
        }
    }
}
