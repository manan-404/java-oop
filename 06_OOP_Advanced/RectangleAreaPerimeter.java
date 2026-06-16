import java.util.Scanner;

class RectangleAreaPerimeter {
    int width, height;

    int area() {
        return width * height;
    }

    int perimeter() {
        return (2 * width) + (2 * height);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        RectangleAreaPerimeter rect = new RectangleAreaPerimeter();

        System.out.print("Enter width: ");
        rect.width = input.nextInt();
        System.out.print("Enter height: ");
        rect.height = input.nextInt();

        System.out.println("Area: " + rect.area());
        System.out.print("Perimeter: " + rect.perimeter());
    }
}
