class StoreManagementSystem {
    public static void main(String[] args) {
        // Create products
        Product p1 = new Product("TV", 4, 34000);
        Product p2 = new Product("Bicycle", 4, 5500);
        Product p3 = new Product("Oven", 3, 70000);

        // Create stores
        Store s1 = new Store("Makro", "Karachi");
        Store s2 = new Store("Hypermart", "Sukkur");

        // Add products to store 1
        s1.addProduct(p1);
        s1.addProduct(p2);
        s1.addProduct(p3);
        s1.displayAll();

        // Delete a product from store 1
        Product removed = s1.deleteProduct("Bicycle");
        if (removed != null) {
            System.out.println("\nDeleted product: " + removed.getName());
        } else {
            System.out.println("\nProduct not found.");
        }
        s1.displayAll();

        // Add products to store 2
        s2.addProduct(p1);
        s2.addProduct(p2);
        s2.addProduct(p3);
        s2.displayAll();

        // Create company and add stores
        Company c1 = new Company("Unilever");
        c1.addStore(s1);
        c1.addStore(s2);
        c1.displayAll();

        // Search how many stores have a specific product
        int count = c1.countStoresWithProduct("TV");
        System.out.println("\nNumber of stores carrying 'TV': " + count);
    }
}
