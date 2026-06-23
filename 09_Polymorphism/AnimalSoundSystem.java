class Animal {
    String name;
    int age;
    String gender;

    Animal(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    void produceSound() {
        System.out.println(name + " makes a sound.");
    }
}

class Dog extends Animal {
    Dog(String name, int age, String gender) { super(name, age, gender); }

    void produceSound() { System.out.println(name + " says: Bow wow!"); }
}

class Frog extends Animal {
    Frog(String name, int age, String gender) { super(name, age, gender); }

    void produceSound() { System.out.println(name + " says: Ribbit ribbit!"); }
}

class Kitten extends Animal {
    Kitten(String name, int age, String gender) { super(name, age, gender); }

    void produceSound() { System.out.println(name + " says: Mew mew!"); }
}

class Tomcat extends Animal {
    Tomcat(String name, int age, String gender) { super(name, age, gender); }

    void produceSound() { System.out.println(name + " says: Meeoowww!"); }
}

class AnimalSoundSystem {
    public static void main(String[] args) {
        Animal[] animals = {
            new Dog("Beagle", 3, "Male"),
            new Frog("Froggy", 1, "Male"),
            new Kitten("Luna", 2, "Female"),
            new Tomcat("Leo", 4, "Male")
        };

        int totalAge = 0;
        for (Animal a : animals) {
            a.produceSound();
            totalAge += a.age;
        }

        System.out.println("\nAverage age: " + (totalAge / (double) animals.length));
    }
}
