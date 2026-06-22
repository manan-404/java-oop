class Vehicle {
    String brand;

    Vehicle(String brand) {
        this.brand = brand;
    }

    // final method — cannot be overridden in any subclass
    final void fuelType() {
        System.out.println("Fuel type: Petrol");
    }

    void show() {
        System.out.println("Brand: " + brand);
    }
}

// final class — cannot be extended further
final class Bike extends Vehicle {
    int speed;

    Bike(String brand, int speed) {
        super(brand);
        this.speed = speed;
    }

    void show() {
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed + " km/h");
    }
}

// This would cause a compile error — Bike is final
// class SportsBike extends Bike { }

class FinalKeywordDemo {
    public static void main(String[] args) {
        Bike bike = new Bike("Honda", 120);
        bike.show();
        bike.fuelType(); // inherited final method — cannot be overridden
    }
}
