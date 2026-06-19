class Company {
    String name;
    Store[] storeList = new Store[10];
    int storeCount = 0;

    Company(String name) {
        this.name = name;
    }

    void addStore(Store store) {
        storeList[storeCount++] = store;
    }

    int countStoresWithProduct(String productName) {
        int count = 0;
        for (int i = 0; i < storeCount; i++) {
            if (storeList[i].searchProduct(productName)) {
                count++;
            }
        }
        return count;
    }

    void displayAll() {
        System.out.println("\n====== Company: " + name + " ======");
        for (int i = 0; i < storeCount; i++) {
            storeList[i].displayAll();
        }
    }
}
