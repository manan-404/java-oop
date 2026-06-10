import java.util.Scanner;

class RowAverageCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = input.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = input.nextInt();

        int[][] arr = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            System.out.println("Row " + (i + 1) + ":");
            for (int j = 0; j < cols; j++) {
                System.out.print("  (" + (i+1) + "," + (j+1) + "): ");
                arr[i][j] = input.nextInt();
            }
        }

        for (int i = 0; i < rows; i++) {
            float sum = 0;
            for (int j = 0; j < cols; j++)
                sum += arr[i][j];
            System.out.println("Average of row " + (i + 1) + ": " + (sum / cols));
        }
    }
}
