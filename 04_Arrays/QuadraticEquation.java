import java.util.Scanner;

class QuadraticEquation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Quadratic Equation: ax² + bx + c");
        System.out.print("Enter a: ");
        double a = input.nextDouble();
        System.out.print("Enter b: ");
        double b = input.nextDouble();
        System.out.print("Enter c: ");
        double c = input.nextDouble();

        double discriminant = (b * b) - (4 * a * c);

        if (discriminant > 0) {
            double x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("Two real roots:");
            System.out.println("X1 = " + x1);
            System.out.print("X2 = " + x2);
        } else if (discriminant == 0) {
            double x = -b / (2 * a);
            System.out.print("One real root: X = " + x);
        } else {
            System.out.print("No real roots (complex roots exist)");
        }
    }
}
