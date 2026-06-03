import java.util.Scanner;

class TriangleTypeChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 3 sides of a triangle:");
        System.out.print("Side 1: ");
        int side1 = input.nextInt();
        System.out.print("Side 2: ");
        int side2 = input.nextInt();
        System.out.print("Side 3: ");
        int side3 = input.nextInt();

        if (side1 == side2 && side1 == side3) {
            System.out.print("Equilateral triangle — all sides are equal");
        } else if (side1 == side2 || side1 == side3 || side2 == side3) {
            System.out.print("Isosceles triangle — two sides are equal");
        } else {
            System.out.print("Scalene triangle — all sides are different");
        }
    }
}
