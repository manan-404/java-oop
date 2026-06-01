import java.util.Scanner;

class LargestOfThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first value: ");
        int x = input.nextInt();
        System.out.print("Enter second value: ");
        int y = input.nextInt();
        System.out.print("Enter third value: ");
        int z = input.nextInt();

        if (x >= y && x >= z) {
            System.out.print(x + " is the largest value");
        } else if (y >= x && y >= z) {
            System.out.print(y + " is the largest value");
        } else {
            System.out.print(z + " is the largest value");
        }
    }
}