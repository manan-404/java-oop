interface Animal {
    void legs();
    void eat();
}

class Spider implements Animal {
    public void legs() { System.out.println("Spider has 8 legs."); }
    public void eat() { System.out.println("Spider eats flies."); }
}

class Caterpillar implements Animal {
    public void legs() { System.out.println("Caterpillar has 16 legs."); }
    public void eat() { System.out.println("Caterpillar eats leaves."); }
}

class Cat implements Animal {
    public void legs() { System.out.println("Cat has 4 legs."); }
    public void eat() { System.out.println("Cat eats meat."); }
}

class AnimalInterfaceDemo {
    public static void main(String[] args) {
        Animal[] animals = {new Spider(), new Caterpillar(), new Cat()};

        for (Animal a : animals) {
            a.legs();
            a.eat();
            System.out.println();
        }
    }
}
