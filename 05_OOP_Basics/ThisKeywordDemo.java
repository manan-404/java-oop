class ThisKeywordDemo {
    String brand;
    int price;
    int stock;

    ThisKeywordDemo(String brand, int price, int stock) {
        // Without 'this', Java would assign the parameter to itself
        this.brand = brand;
        this.price = price;
        this.stock = stock;
    }

    void show() {
        System.out.println("Brand: " + this.brand);
        System.out.println("Price: " + this.price);
        System.out.print("Stock: " + this.stock);
    }

    public static void main(String[] args) {
        ThisKeywordDemo product1 = new ThisKeywordDemo("Samsung", 50000, 10);
        ThisKeywordDemo product2 = new ThisKeywordDemo("Apple", 200000, 5);

        System.out.println("--- Product 1 ---");
        product1.show();
        System.out.println("\n--- Product 2 ---");
        product2.show();
    }
}
