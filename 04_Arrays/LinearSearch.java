import java.util.Scanner;

class LinearSearch {
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

        System.out.print("Enter value to search: ");
        int target = input.nextInt();

        boolean found = false;
        for (int i = 0; i < size; i++) {
            if (arr[i] == target) {
                System.out.print(target + " found at index " + i);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.print(target + " not found in the array");
        }
    }
}
