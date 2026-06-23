class Maths {
    void display() {
        System.out.println("I am the display method of Maths class.");
    }
}

class Algebra extends Maths {
    void display() {
        System.out.println("I am the display method of Algebra class.");
    }
}

class Geometry extends Maths {
    void display() {
        System.out.println("I am the display method of Geometry class.");
    }
}

class MethodOverridingDemo {
    public static void main(String[] args) {
        Maths m1 = new Maths();
        Maths m2 = new Algebra();   // parent reference, child object
        Maths m3 = new Geometry();  // parent reference, child object

        m1.display(); // calls Maths
        m2.display(); // calls Algebra — runtime decision
        m3.display(); // calls Geometry — runtime decision
    }
}
