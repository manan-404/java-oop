import java.util.Scanner;

class GradeCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your marks (0-100): ");
        int marks = input.nextInt();

        if (marks >= 90) {
            System.out.print("Grade: A");
        } else if (marks >= 80) {
            System.out.print("Grade: B");
        } else if (marks >= 70) {
            System.out.print("Grade: C");
        } else if (marks >= 60) {
            System.out.print("Grade: D");
        } else if (marks >= 0) {
            System.out.print("Grade: F");
        } else {
            System.out.print("Invalid marks entered");
        }
    }
}