class ConstructorOverloadingDemo {
    String name;
    int age;
    String course;

    // Constructor 1 — only name
    ConstructorOverloadingDemo(String name) {
        this.name = name;
        this.age = 0;
        this.course = "Not enrolled";
    }

    // Constructor 2 — name and age
    ConstructorOverloadingDemo(String name, int age) {
        this.name = name;
        this.age = age;
        this.course = "Not enrolled";
    }

    // Constructor 3 — all fields
    ConstructorOverloadingDemo(String name, int age, String course) {
        this.name = name;
        this.age = age;
        this.course = course;
    }

    void show() {
        System.out.println("Name: " + name + " | Age: " + age + " | Course: " + course);
    }

    public static void main(String[] args) {
        ConstructorOverloadingDemo s1 = new ConstructorOverloadingDemo("Manan");
        ConstructorOverloadingDemo s2 = new ConstructorOverloadingDemo("Tayyab", 21);
        ConstructorOverloadingDemo s3 = new ConstructorOverloadingDemo("Uzair", 22, "Computer Science");

        s1.show();
        s2.show();
        s3.show();
    }
}
