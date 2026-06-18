class PassByValueDemo {
    int value;

    PassByValueDemo(int value) {
        this.value = value;
    }

    // Primitives — changes don't affect the original
    static void changePrimitive(int num) {
        num = 999;
        System.out.println("Inside method (primitive): " + num);
    }

    // Objects — changes DO affect the original
    static void changeObject(PassByValueDemo obj) {
        obj.value = 999;
        System.out.println("Inside method (object): " + obj.value);
    }

    public static void main(String[] args) {
        // Primitive test
        int number = 10;
        System.out.println("Before method (primitive): " + number);
        changePrimitive(number);
        System.out.println("After method (primitive): " + number);

        System.out.println();

        // Object test
        PassByValueDemo obj = new PassByValueDemo(10);
        System.out.println("Before method (object): " + obj.value);
        changeObject(obj);
        System.out.println("After method (object): " + obj.value);
    }
}
