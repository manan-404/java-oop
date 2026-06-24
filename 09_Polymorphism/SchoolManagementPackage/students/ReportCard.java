package students;

public class ReportCard {
    Students student;

    public ReportCard(Students student) {
        this.student = student;
    }

    public void show() {
        double avg = student.getMarks() / student.getSubjects();
        System.out.println("====== Report Card ======");
        System.out.println("Name        : " + student.getName());
        System.out.println("Roll Number : " + student.getRollNo());
        System.out.println("Average     : " + avg);
        System.out.println("=========================");
    }
}
