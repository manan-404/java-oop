import students.Students;
import students.ReportCard;
import teachers.Teacher;
import teachers.SalarySlip;
import library.Book;
import library.LibraryCard;

class Main {
    public static void main(String[] args) {
        Students s1 = new Students(101, "Manan", 444, 5);
        ReportCard rc1 = new ReportCard(s1);
        rc1.show();
        System.out.println();

        Teacher t1 = new Teacher("Tayyab", 222, 150000);
        SalarySlip ss1 = new SalarySlip(t1);
        ss1.show();
        System.out.println();

        Book b1 = new Book("OOP in Java", "James Gosling", 550);
        LibraryCard lc1 = new LibraryCard(b1, "Safiullah");
        lc1.showDetails();
    }
}
