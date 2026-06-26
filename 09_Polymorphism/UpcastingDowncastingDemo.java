class Vehicle {
    String brand;

    Vehicle(String brand) {
        this.brand = brand;
    }

    void fuel() {
        System.out.println(brand + " runs on fuel.");
    }
}

class Car extends Vehicle {
    int doors;

    Car(String brand, int doors) {
        super(brand);
        this.doors = doors;
    }

    void honk() {
        System.out.println(brand + " goes beep beep!");
    }
}

class Truck extends Vehicle {
    double payload;

    Truck(String brand, double payload) {
        super(brand);
        this.payload = payload;
    }

    void loadCargo() {
        System.out.println(brand + " loading " + payload + " tons.");
    }
}

class UpcastingDowncastingDemo {
    public static void main(String[] args) {
        // UPCASTING — automatic, no cast needed
        // Child object stored in parent reference
        Vehicle v1 = new Car("Toyota", 4);    // Car upcast to Vehicle
        Vehicle v2 = new Truck("Volvo", 20.5); // Truck upcast to Vehicle

        System.out.println("=== After Upcasting ===");
        v1.fuel(); // can only call Vehicle methods
        v2.fuel();

        // v1.honk() — compile error, Vehicle reference can't see Car methods

        System.out.println("\n=== After Downcasting ===");
        // DOWNCASTING — manual, must use instanceof first for safety
        if (v1 instanceof Car) {
            Car car = (Car) v1; // downcast back to Car
            car.honk();         // now Car methods are accessible
            System.out.println("Doors: " + car.doors);
        }

        if (v2 instanceof Truck) {
            Truck truck = (Truck) v2; // downcast back to Truck
            truck.loadCargo();
            System.out.println("Payload: " + truck.payload + " tons");
        }
    }
}
