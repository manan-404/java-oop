import java.util.Scanner;

class ArrayReversal {
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

        System.out.print("Original: ");
        for (int val : arr) System.out.print(val + " ");

        int left = 0, right = size - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }

        System.out.print("\nReversed: ");
        for (int val : arr) System.out.print(val + " ");
    }
}
