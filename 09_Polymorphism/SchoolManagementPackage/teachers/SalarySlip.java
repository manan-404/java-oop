package teachers;

public class SalarySlip {
    Teacher teacher;

    public SalarySlip(Teacher teacher) {
        this.teacher = teacher;
    }

    public void show() {
        System.out.println("====== Salary Slip ======");
        System.out.println("Name   : " + teacher.getName());
        System.out.println("ID     : " + teacher.getId());
        System.out.println("Salary : " + teacher.getSalary());
        System.out.println("=========================");
    }
}
