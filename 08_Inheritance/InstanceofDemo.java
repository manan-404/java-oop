class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }
}

class Dog extends Animal {
    Dog(String name) {
        super(name);
    }

    void bark() {
        System.out.println(name + " says: Woof!");
    }
}

class Cat extends Animal {
    Cat(String name) {
        super(name);
    }

    void meow() {
        System.out.println(name + " says: Meow!");
    }
}

class InstanceofDemo {
    public static void main(String[] args) {
        Animal a1 = new Dog("Bruno");
        Animal a2 = new Cat("Whiskers");
        Animal a3 = new Animal("Unknown");

        Animal[] animals = {a1, a2, a3};

        for (Animal a : animals) {
            System.out.println(a.name + " instanceof Animal: " + (a instanceof Animal));
            System.out.println(a.name + " instanceof Dog: " + (a instanceof Dog));
            System.out.println(a.name + " instanceof Cat: " + (a instanceof Cat));

            // Safe downcasting using instanceof
            if (a instanceof Dog) {
                ((Dog) a).bark();
            } else if (a instanceof Cat) {
                ((Cat) a).meow();
            }
            System.out.println();
        }
    }
}
