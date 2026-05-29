import java.util.Scanner;

class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two integers: ");
        int x = input.nextInt();
        int y = input.nextInt();

        float result = (float) x / (float) y;
        System.out.print("Result: " + result);
    }
}