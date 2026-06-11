import java.util.Scanner;

class AngleConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter degrees to convert to radians: ");
        int degree = input.nextInt();
        System.out.println(degree + "° = " + Math.toRadians(degree) + " radians");

        System.out.print("\nEnter radians to convert to degrees: ");
        float radian = input.nextFloat();
        System.out.print(radian + " radians = " + Math.toDegrees(radian) + "°");
    }
}
