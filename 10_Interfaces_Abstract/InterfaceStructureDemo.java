// Regular interface — declares a method without body
interface Printable {
    void print(int value);
}

// Marker interface — empty, used to tag/mark a class
interface Serializable {
}

// Class implementing the regular interface
class Document implements Printable, Serializable {
    public void print(int value) {
        System.out.println("Printing document with value: " + value);
    }
}

class InterfaceStructureDemo {
    public static void main(String[] args) {
        Document doc = new Document();
        doc.print(42);

        // Checking marker interface
        System.out.println("Is Serializable: " + (doc instanceof Serializable));
        System.out.println("Is Printable: " + (doc instanceof Printable));
    }
}
