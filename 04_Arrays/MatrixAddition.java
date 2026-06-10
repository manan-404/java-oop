import java.util.Scanner;

class MatrixAddition {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] m1 = new int[3][3];
        int[][] m2 = new int[3][3];
        int[][] sum = new int[3][3];

        System.out.println("Enter values for Matrix 1 (3x3):");
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++) {
                System.out.print("  (" + (i+1) + "," + (j+1) + "): ");
                m1[i][j] = input.nextInt();
            }

        System.out.println("Enter values for Matrix 2 (3x3):");
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++) {
                System.out.print("  (" + (i+1) + "," + (j+1) + "): ");
                m2[i][j] = input.nextInt();
            }

        System.out.println("\nMatrix 1:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) System.out.print(m1[i][j] + " ");
            System.out.println();
        }

        System.out.println("\nMatrix 2:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) System.out.print(m2[i][j] + " ");
            System.out.println();
        }

        System.out.println("\nSum Matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                sum[i][j] = m1[i][j] + m2[i][j];
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }
    }
}
