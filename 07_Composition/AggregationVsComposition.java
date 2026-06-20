// ===== COMPOSITION =====
// Engine CANNOT exist without Car
// If Car is destroyed, Engine is destroyed too

class Engine {
    String type;

    Engine(String type) {
        this.type = type;
    }

    void show() {
        System.out.println("Engine type: " + type);
    }
}

class Car {
    String model;
    Engine engine; // Car OWNS the engine — composition

    Car(String model, String engineType) {
        this.model = model;
        this.engine = new Engine(engineType); // Engine created inside Car
    }

    void show() {
        System.out.println("Car model: " + model);
        engine.show();
    }
}


// ===== AGGREGATION =====
// Student CAN exist without a Department
// Department does not own the student

class Student {
    String name;

    Student(String name) {
        this.name = name;
    }

    void show() {
        System.out.println("Student: " + name);
    }
}

class Department {
    String deptName;
    Student student; // Department REFERENCES a student — aggregation

    Department(String deptName, Student student) {
        this.deptName = deptName;
        this.student = student; // Student created OUTSIDE and passed in
    }

    void show() {
        System.out.println("Department: " + deptName);
        student.show();
    }
}


class AggregationVsComposition {
    public static void main(String[] args) {
        // Composition — Engine is created inside Car, depends on it
        System.out.println("=== Composition ===");
        Car car = new Car("Civic", "V6");
        car.show();

        // Aggregation — Student exists on its own, just referenced by Department
        System.out.println("\n=== Aggregation ===");
        Student s1 = new Student("Manan"); // exists independently
        Department dept = new Department("Computer Science", s1);
        dept.show();

        // Student still exists even without the department
        System.out.println("\nStudent still exists independently:");
        s1.show();
    }
}
