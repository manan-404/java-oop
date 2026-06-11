import java.util.Scanner;

class DivisionWithRounding {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter dividend: ");
        double num1 = input.nextDouble();
        System.out.print("Enter divisor: ");
        double num2 = input.nextDouble();

        double result = num1 / num2;
        System.out.println(num1 + " / " + num2 + " = " + result);
        System.out.print("Rounded result: " + Math.round(result));
    }
}
