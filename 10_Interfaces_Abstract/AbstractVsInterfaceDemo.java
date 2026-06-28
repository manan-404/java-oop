// Abstract class — used when subclasses SHARE common fields and behavior
// A Vehicle has a brand and speed — all vehicles share these
abstract class Vehicle {
    String brand;
    int speed;

    Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    // Shared method — all vehicles show info the same way
    void showInfo() {
        System.out.println("Brand: " + brand + " | Speed: " + speed + " km/h");
    }

    // Abstract method — each vehicle starts differently
    abstract void start();
}

class Car extends Vehicle {
    Car(String brand, int speed) { super(brand, speed); }

    public void start() {
        System.out.println(brand + " car starts with a key.");
    }
}

class Bicycle extends Vehicle {
    Bicycle(String brand, int speed) { super(brand, speed); }

    public void start() {
        System.out.println(brand + " bicycle starts by pedaling.");
    }
}


// Interface — used when UNRELATED classes need to follow the same contract
// A Printer and a Phone are unrelated but both can be rechargeable
interface Rechargeable {
    void recharge();
}

class Phone implements Rechargeable {
    String model;

    Phone(String model) { this.model = model; }

    public void recharge() {
        System.out.println(model + " phone is charging via USB.");
    }
}

class Laptop implements Rechargeable {
    String model;

    Laptop(String model) { this.model = model; }

    public void recharge() {
        System.out.println(model + " laptop is charging via power adapter.");
    }
}


class AbstractVsInterfaceDemo {
    public static void main(String[] args) {
        System.out.println("=== Abstract Class (shared state) ===");
        Vehicle car = new Car("Toyota", 180);
        Vehicle bike = new Bicycle("Phoenix", 30);
        car.showInfo();   car.start();
        bike.showInfo();  bike.start();

        System.out.println("\n=== Interface (shared contract) ===");
        Rechargeable phone = new Phone("Samsung Galaxy");
        Rechargeable laptop = new Laptop("Dell XPS");
        phone.recharge();
        laptop.recharge();
    }
}
