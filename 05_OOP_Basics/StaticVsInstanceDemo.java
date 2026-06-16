class StaticVsInstanceDemo {
    String model;
    int year;
    static int totalCars = 0; // shared across all objects

    StaticVsInstanceDemo(String model, int year) {
        this.model = model;
        this.year = year;
        totalCars++; // increments every time a new object is created
    }

    void show() {
        System.out.println("Model: " + model + " | Year: " + year);
    }

    public static void main(String[] args) {
        StaticVsInstanceDemo car1 = new StaticVsInstanceDemo("Civic", 2020);
        StaticVsInstanceDemo car2 = new StaticVsInstanceDemo("Corolla", 2021);
        StaticVsInstanceDemo car3 = new StaticVsInstanceDemo("Cultus", 2022);

        car1.show();
        car2.show();
        car3.show();

        System.out.print("\nTotal cars created: " + StaticVsInstanceDemo.totalCars);
    }
}
