import java.util.Scanner;

class RectangleArea {
    double length, width;
    Scanner input = new Scanner(System.in);

    void setDimensions() {
        System.out.print("Enter length of rectangle: ");
        this.length = input.nextDouble();
        System.out.print("Enter width of rectangle: ");
        this.width = input.nextDouble();
    }

    double getArea() {
        return length * width;
    }

    public static void main(String[] args) {
        RectangleArea rect = new RectangleArea();
        rect.setDimensions();
        System.out.print("The area of the rectangle is: " + rect.getArea());
    }
}
