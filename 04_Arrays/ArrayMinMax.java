import java.util.Scanner;

class ArrayMinMax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size = input.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter elements:");
        for (int i = 0; i < size; i++) {
            System.out.print("  [" + i + "]: ");
            arr[i] = input.nextInt();
        }

        int min = arr[0], max = arr[0];
        for (int i = 1; i < size; i++) {
            if (arr[i] < min) min = arr[i];
            if (arr[i] > max) max = arr[i];
        }

        System.out.println("Minimum value: " + min);
        System.out.print("Maximum value: " + max);
    }
}
