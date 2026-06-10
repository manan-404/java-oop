import java.util.Scanner;

class JaggedArrayBubbleSort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = input.nextInt();

        int[][] arr = new int[rows][];

        for (int i = 0; i < rows; i++) {
            System.out.print("Enter columns for row " + (i + 1) + ": ");
            int cols = input.nextInt();
            arr[i] = new int[cols];
            for (int j = 0; j < cols; j++) {
                System.out.print("  (" + (i+1) + "," + (j+1) + "): ");
                arr[i][j] = input.nextInt();
            }
        }

        System.out.println("\nOriginal Array:");
        for (int[] row : arr) {
            for (int val : row) System.out.print(val + " ");
            System.out.println();
        }

        // Bubble sort each row
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < arr[i].length - 1; j++) {
                for (int k = 0; k < arr[i].length - 1 - j; k++) {
                    if (arr[i][k] > arr[i][k + 1]) {
                        int temp = arr[i][k];
                        arr[i][k] = arr[i][k + 1];
                        arr[i][k + 1] = temp;
                    }
                }
            }
        }

        System.out.println("\nSorted Array (each row ascending):");
        for (int[] row : arr) {
            for (int val : row) System.out.print(val + " ");
            System.out.println();
        }
    }
}
