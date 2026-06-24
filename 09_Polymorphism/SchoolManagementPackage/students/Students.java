package students;

public class Students {
    private int rollNo;
    private String name;
    private double marks;
    private int subjects;

    public Students(int rollNo, String name, double marks, int subjects) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
        this.subjects = subjects;
    }

    public int getRollNo() { return rollNo; }
    public String getName() { return name; }
    public double getMarks() { return marks; }
    public int getSubjects() { return subjects; }
}
