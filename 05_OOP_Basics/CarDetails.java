import java.util.Scanner;

class CarDetails {
    String model, make, color;
    int year;
    Scanner input = new Scanner(System.in);

    void getInfo() {
        System.out.print("Car Model: ");
        model = input.nextLine();
        System.out.print("Car Make: ");
        make = input.nextLine();
        System.out.print("Car Color: ");
        color = input.nextLine();
        System.out.print("Car Year: ");
        year = input.nextInt();
    }

    void show() {
        System.out.println("\nCar Model: " + model);
        System.out.println("Car Make: " + make);
        System.out.println("Car Color: " + color);
        System.out.print("Car Year: " + year);
    }

    public static void main(String[] args) {
        CarDetails myCar = new CarDetails();
        myCar.getInfo();
        myCar.show();
    }
}
