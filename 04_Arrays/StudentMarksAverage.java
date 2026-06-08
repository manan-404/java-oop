import java.util.Scanner;

class StudentMarksAverage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] marks = new int[20];
        float sum = 0;

        System.out.println("Enter marks for 20 subjects:");
        for (int i = 0; i < marks.length; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            marks[i] = input.nextInt();
            sum += marks[i];
        }

        float average = sum / marks.length;
        System.out.print("Average marks: " + average);
    }
}
