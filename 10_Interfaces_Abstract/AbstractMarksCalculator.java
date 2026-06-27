import java.util.Scanner;

abstract class Marks {
    int totalMarks;

    Marks(int totalMarks) {
        this.totalMarks = totalMarks;
    }

    abstract double getPercentage(int obtainedMarks);
}

class ClassA extends Marks {
    ClassA() {
        super(300);
    }

    public double getPercentage(int obtainedMarks) {
        return ((double) obtainedMarks / totalMarks) * 100;
    }
}

class ClassB extends Marks {
    ClassB() {
        super(400);
    }

    public double getPercentage(int obtainedMarks) {
        return ((double) obtainedMarks / totalMarks) * 100;
    }
}

class AbstractMarksCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ClassA studentA = new ClassA();
        ClassB studentB = new ClassB();

        System.out.print("Enter marks for Class A student (out of 300): ");
        int marksA = input.nextInt();
        System.out.println("Percentage: " + studentA.getPercentage(marksA) + "%");

        System.out.print("Enter marks for Class B student (out of 400): ");
        int marksB = input.nextInt();
        System.out.println("Percentage: " + studentB.getPercentage(marksB) + "%");
    }
}
