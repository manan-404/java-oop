interface Officer {
    void info();
}

interface Employee {
    void details();
}

class Person implements Officer, Employee {
    String name;
    int id;
    String role;

    Person(String name, int id, String role) {
        this.name = name;
        this.id = id;
        this.role = role;
    }

    public void details() {
        System.out.println("Employee Details:");
        System.out.println("  Name: " + name);
        System.out.println("  ID: " + id);
    }

    public void info() {
        System.out.println("Officer Info:");
        System.out.println("  Name: " + name);
        System.out.println("  Role: " + role);
    }
}

class MultipleInterfacesDemo {
    public static void main(String[] args) {
        Person p1 = new Person("Manan", 101, "Security Officer");
        p1.details();
        System.out.println();
        p1.info();

        // Can be referenced by either interface type
        Employee emp = p1;
        Officer off = p1;

        System.out.println("\nVia Employee reference:");
        emp.details();

        System.out.println("\nVia Officer reference:");
        off.info();
    }
}
