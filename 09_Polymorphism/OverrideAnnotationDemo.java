class Shape {
    String color;

    Shape(String color) {
        this.color = color;
    }

    void draw() {
        System.out.println("Drawing a shape.");
    }

    public String toString() {
        return "Shape color: " + color;
    }
}

class Circle extends Shape {
    double radius;

    Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    void draw() {
        System.out.println("Drawing a circle with radius: " + radius);
    }

    @Override
    public String toString() {
        return "Circle | Color: " + color + " | Radius: " + radius;
    }
}

class Rectangle extends Shape {
    double length, width;

    Rectangle(String color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    @Override
    void draw() {
        System.out.println("Drawing a rectangle " + length + "x" + width);
    }

    @Override
    public String toString() {
        return "Rectangle | Color: " + color + " | " + length + "x" + width;
    }
}

class OverrideAnnotationDemo {
    public static void main(String[] args) {
        Shape[] shapes = {
            new Circle("Red", 5.0),
            new Rectangle("Blue", 4.0, 6.0),
            new Shape("Green")
        };

        for (Shape s : shapes) {
            s.draw();
            System.out.println(s.toString());
            System.out.println();
        }
    }
}
