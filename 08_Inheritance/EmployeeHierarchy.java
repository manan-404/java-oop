class Employee {
    String name;
    String qualification;
    String grade;

    Employee(String name, String qualification, String grade) {
        this.name = name;
        this.qualification = qualification;
        this.grade = grade;
    }

    void intro() {
        System.out.println("Name: " + name);
        System.out.println("Qualification: " + qualification);
        System.out.println("Grade: " + grade);
    }
}

class Teacher extends Employee {
    String subject;

    Teacher(String name, String qualification, String grade, String subject) {
        super(name, qualification, grade);
        this.subject = subject;
    }

    void teachingMethod() {
        System.out.println("Subject: " + subject);
    }
}

class Professor extends Employee {
    int publications;
    int experience;

    Professor(String name, String qualification, String grade, int publications, int experience) {
        super(name, qualification, grade);
        this.publications = publications;
        this.experience = experience;
    }

    void researchInfo() {
        System.out.println("Publications: " + publications);
        System.out.println("Experience: " + experience + " years");
    }
}

class EmployeeHierarchy {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Manan", "BS CS", "A", "Java");
        Professor p1 = new Professor("Dr. Tayyab", "Ph.D", "A+", 12, 10);

        System.out.println("=== Teacher ===");
        t1.intro();
        t1.teachingMethod();

        System.out.println("\n=== Professor ===");
        p1.intro();
        p1.researchInfo();
    }
}
