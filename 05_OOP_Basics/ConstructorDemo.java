class ConstructorDemo {
    String name;
    int age;
    String course;

    // Constructor
    ConstructorDemo(String name, int age, String course) {
        this.name = name;
        this.age = age;
        this.course = course;
    }

    void show() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.print("Course: " + course);
    }

    public static void main(String[] args) {
        ConstructorDemo s1 = new ConstructorDemo("Manan", 20, "Computer Science");
        ConstructorDemo s2 = new ConstructorDemo("Safiullah", 21, "Software Engineering");

        System.out.println("--- Student 1 ---");
        s1.show();
        System.out.println("\n--- Student 2 ---");
        s2.show();
    }
}
