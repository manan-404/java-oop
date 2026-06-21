class SuperClass {
    String name;

    SuperClass(String name) {
        this.name = name;
    }

    String info() {
        return "SuperClass name: " + name;
    }
}

class SubClass extends SuperClass {
    String name;

    SubClass(String superName, String subName) {
        super(superName);
        this.name = subName;
    }

    String info() {
        return "SubClass name: " + name;
    }

    String bothInfo() {
        return super.info() + "\n" + info();
    }
}

class SuperSubClassDemo {
    public static void main(String[] args) {
        SuperClass sc = new SuperClass("Parent");
        SubClass sbc = new SubClass("Parent", "Child");

        System.out.println(sc.info());
        System.out.println(sbc.info());
        System.out.println("\nBoth:");
        System.out.println(sbc.bothInfo());
    }
}
