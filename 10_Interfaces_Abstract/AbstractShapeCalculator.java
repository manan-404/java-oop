abstract class Shape {
    abstract double rectangleArea(double length, double width);
    abstract double squareArea(double side);
    abstract double circleArea(double radius);
}

class AreaCalculator extends Shape {
    public double rectangleArea(double length, double width) {
        return length * width;
    }

    public double squareArea(double side) {
        return side * side;
    }

    public double circleArea(double radius) {
        return Math.PI * radius * radius;
    }
}

class AbstractShapeCalculator {
    public static void main(String[] args) {
        AreaCalculator calc = new AreaCalculator();

        System.out.println("Rectangle area (4.5 x 5): " + calc.rectangleArea(4.5, 5));
        System.out.println("Square area (9.01): " + calc.squareArea(9.01));
        System.out.println("Circle area (radius 6.3): " + calc.circleArea(6.3));
    }
}
