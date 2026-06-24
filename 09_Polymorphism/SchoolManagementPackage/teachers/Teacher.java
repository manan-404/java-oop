package teachers;

public class Teacher {
    private String name;
    private int id;
    private double salary;

    public Teacher(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public String getName() { return name; }
    public int getId() { return id; }
    public double getSalary() { return salary; }
}
