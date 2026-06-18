class MethodOverloadingDemo {
    static void computations(int length, int width) {
        System.out.println("Rectangle area: " + (length * width));
    }

    static void computations(String name, int age) {
        System.out.println("Name: " + name + " | Age: " + age);
    }

    static void computations(double mass, double acceleration) {
        System.out.println("Force: " + (mass * acceleration));
    }

    public static void main(String[] args) {
        computations(10, 5);
        computations("Manan", 20);
        computations(12.5, 9.8);
    }
}
