import java.util.Scanner;

class EmployeeSalary {
    double salary;
    int hours;
    Scanner input = new Scanner(System.in);

    void getInfo() {
        System.out.print("Enter salary: $");
        salary = input.nextDouble();
        System.out.print("Enter hours worked per day: ");
        hours = input.nextInt();
    }

    void calculateFinalSalary() {
        if (hours > 6) {
            salary += 5;
        }
        System.out.print("Final Salary: $" + salary);
    }

    public static void main(String[] args) {
        EmployeeSalary emp = new EmployeeSalary();
        emp.getInfo();
        emp.calculateFinalSalary();
    }
}
