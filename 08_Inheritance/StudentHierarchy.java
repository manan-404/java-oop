class Student {
    String name;
    int id;
    String year;

    Student(String name, int id, String year) {
        this.name = name;
        this.id = id;
        this.year = year;
    }

    void showInfo() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Year: " + year);
    }
}

class BSStudent extends Student {
    double gpa;
    String award;

    BSStudent(String name, int id, String year, double gpa, String award) {
        super(name, id, year);
        this.gpa = gpa;
        this.award = award;
    }

    void showAward() {
        showInfo();
        System.out.println("GPA: " + gpa);
        System.out.println("Award: " + award);
    }
}

class MSStudent extends BSStudent {
    String specialization;
    String publication;

    MSStudent(String name, int id, String year, double gpa, String award, String specialization, String publication) {
        super(name, id, year, gpa, award);
        this.specialization = specialization;
        this.publication = publication;
    }

    void showPublication() {
        showInfo();
        System.out.println("GPA: " + gpa);
        System.out.println("Award: " + award);
        System.out.println("Specialization: " + specialization);
        System.out.println("Publication: " + publication);
    }
}

class StudentHierarchy {
    public static void main(String[] args) {
        Student s1 = new Student("Manan", 101, "1st year");
        BSStudent bs1 = new BSStudent("Tayyab", 102, "2nd year", 3.9, "Tech Award");
        MSStudent ms1 = new MSStudent("Safiullah", 103, "3rd year", 4.0, "Gold Medal", "AI", "AI for Social Good");

        System.out.println("=== Student ===");
        s1.showInfo();

        System.out.println("\n=== BS Student ===");
        bs1.showAward();

        System.out.println("\n=== MS Student ===");
        ms1.showPublication();
    }
}
