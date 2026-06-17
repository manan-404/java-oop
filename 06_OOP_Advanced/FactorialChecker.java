import java.util.Scanner;

class FactorialChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();

        int fact = 1, origNum = 0;
        boolean isFactorial = false;

        for (int i = 1; i <= num; i++) {
            fact *= i;
            if (fact == num) {
                isFactorial = true;
                origNum = i;
                break;
            }
        }

        if (isFactorial) {
            System.out.print(num + " is the factorial of " + origNum);
        } else {
            System.out.print(num + " is not a factorial of any integer");
        }
    }
}
