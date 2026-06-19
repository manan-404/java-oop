class Product {
    String name;
    int quantity;
    double price;

    Product(String name, int quantity, double price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    String getName() {
        return name;
    }

    void display() {
        System.out.println("  Product Name: " + name);
        System.out.println("  Quantity: " + quantity);
        System.out.println("  Price: " + price);
    }
}
