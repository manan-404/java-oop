import java.util.Scanner;

class MethodOverloadingShapes {
    int area(int length, int width) {
        return length * width;
    }

    double area(double radius) {
        return Math.PI * radius * radius;
    }

    double area(double base, double height) {
        return 0.5 * base * height;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        MethodOverloadingShapes shape = new MethodOverloadingShapes();

        System.out.print("Enter length and width of rectangle: ");
        int length = input.nextInt();
        int width = input.nextInt();
        System.out.println("Rectangle area: " + shape.area(length, width));

        System.out.print("Enter radius of circle: ");
        double radius = input.nextDouble();
        System.out.println("Circle area: " + shape.area(radius));

        System.out.print("Enter base and height of triangle: ");
        double base = input.nextDouble();
        double height = input.nextDouble();
        System.out.println("Triangle area: " + shape.area(base, height));
    }
}
