import java.util.Scanner;

class MatrixTranspose {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter rows: ");
        int rows = input.nextInt();
        System.out.print("Enter columns: ");
        int cols = input.nextInt();

        int[][] matrix = new int[rows][cols];
        int[][] transpose = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            System.out.println("Row " + (i + 1) + ":");
            for (int j = 0; j < cols; j++) {
                System.out.print("  (" + (i+1) + "," + (j+1) + "): ");
                matrix[i][j] = input.nextInt();
            }
        }

        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                transpose[j][i] = matrix[i][j];

        System.out.println("\nOriginal Matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++)
                System.out.print(matrix[i][j] + " ");
            System.out.println();
        }

        System.out.println("\nTransposed Matrix:");
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++)
                System.out.print(transpose[i][j] + " ");
            System.out.println();
        }
    }
}
