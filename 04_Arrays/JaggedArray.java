import java.util.Scanner;

class JaggedArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = input.nextInt();

        int[][] arr = new int[rows][];

        for (int i = 0; i < rows; i++) {
            System.out.print("Enter number of columns for row " + (i + 1) + ": ");
            int cols = input.nextInt();
            arr[i] = new int[cols];

            System.out.println("Enter values:");
            for (int j = 0; j < cols; j++) {
                System.out.print("  (" + (i+1) + "," + (j+1) + "): ");
                arr[i][j] = input.nextInt();
            }
        }

        System.out.println("\nJagged Array:");
        for (int i = 0; i < rows; i++) {
            System.out.print("Row " + (i + 1) + ": ");
            for (int j = 0; j < arr[i].length; j++)
                System.out.print(arr[i][j] + " ");
            System.out.println("(Length: " + arr[i].length + ")");
        }
    }
}
