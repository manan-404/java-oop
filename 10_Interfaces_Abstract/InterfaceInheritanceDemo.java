// Base interface
interface Printable {
    void print();
}

// Extended interface — inherits print() and adds scan()
interface PrinterScanner extends Printable {
    void scan();
}

// Extended further — inherits print() and scan(), adds fax()
interface AllInOnePrinter extends PrinterScanner {
    void fax();
}

// Class must implement ALL methods from the entire chain
class OfficePrinter implements AllInOnePrinter {
    String model;

    OfficePrinter(String model) {
        this.model = model;
    }

    public void print() {
        System.out.println(model + ": Printing document...");
    }

    public void scan() {
        System.out.println(model + ": Scanning document...");
    }

    public void fax() {
        System.out.println(model + ": Sending fax...");
    }
}

// Class implementing only the base interface
class BasicPrinter implements Printable {
    public void print() {
        System.out.println("Basic printer: Printing document...");
    }
}

class InterfaceInheritanceDemo {
    public static void main(String[] args) {
        System.out.println("=== Basic Printer ===");
        BasicPrinter basic = new BasicPrinter();
        basic.print();

        System.out.println("\n=== Office Printer (All-in-One) ===");
        OfficePrinter office = new OfficePrinter("HP LaserJet");
        office.print();
        office.scan();
        office.fax();

        // Can be referenced by any interface in the chain
        System.out.println("\n=== Via Printable reference ===");
        Printable p = new OfficePrinter("Canon");
        p.print(); // only print() accessible through Printable reference
    }
}
