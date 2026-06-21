class University {
    String name;

    University(String name) {
        this.name = name;
    }

    void displayInfo() {
        System.out.println("University: " + name);
    }
}

class Department extends University {
    String specialization;
    String type;
    String head;

    Department(String name, String specialization, String type, String head) {
        super(name);
        this.specialization = specialization;
        this.type = type;
        this.head = head;
    }

    void displayDepartment() {
        System.out.println("University: " + name);
        System.out.println("Specialization: " + specialization);
        System.out.println("Type: " + type);
        System.out.println("Head: " + head);
    }
}

class Library extends University {
    int totalBooks;
    String bookType;

    Library(String name, int totalBooks, String bookType) {
        super(name);
        this.totalBooks = totalBooks;
        this.bookType = bookType;
    }

    void displayLibrary() {
        System.out.println("University: " + name);
        System.out.println("Total Books: " + totalBooks);
        System.out.println("Book Type: " + bookType);
    }
}

class UniversityHierarchy {
    public static void main(String[] args) {
        University iba = new University("IBA Sukkur");

        Department d1 = new Department("IBA Sukkur", "Computer Science", "Science", "Ismail");
        Department d2 = new Department("IBA Sukkur", "Business Administration", "Commerce", "Abdullah");

        Library lib1 = new Library("IBA Sukkur", 500, "Novels");
        Library lib2 = new Library("IBA Sukkur", 1200, "Science");

        System.out.println("=== University ===");
        iba.displayInfo();

        System.out.println("\n=== Departments ===");
        d1.displayDepartment();
        System.out.println();
        d2.displayDepartment();

        System.out.println("\n=== Libraries ===");
        lib1.displayLibrary();
        System.out.println();
        lib2.displayLibrary();
    }
}
