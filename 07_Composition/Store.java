class Store {
    String name;
    String location;
    Product[] productList = new Product[100];
    int productCount = 0;

    Store(String name, String location) {
        this.name = name;
        this.location = location;
    }

    String getName() {
        return name;
    }

    void addProduct(Product p) {
        productList[productCount++] = p;
    }

    boolean searchProduct(String productName) {
        for (int i = 0; i < productCount; i++) {
            if (productList[i] != null && productList[i].getName().equals(productName)) {
                return true;
            }
        }
        return false;
    }

    Product deleteProduct(String productName) {
        for (int i = 0; i < productCount; i++) {
            if (productList[i] != null && productList[i].getName().equals(productName)) {
                Product removed = productList[i];
                productList[i] = productList[productCount - 1];
                productList[productCount - 1] = null;
                productCount--;
                return removed;
            }
        }
        return null;
    }

    void displayAll() {
        System.out.println("\nStore: " + name + " | Location: " + location);
        for (int i = 0; i < productCount; i++) {
            if (productList[i] != null) {
                System.out.println("  --- Product " + (i + 1) + " ---");
                productList[i].display();
            }
        }
    }
}
