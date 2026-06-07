import java.util.Scanner;

class StringComparisonDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String s1 = input.nextLine();
        System.out.print("Enter second string: ");
        String s2 = input.nextLine();

        if (s1.equals(s2)) {
            System.out.println("Strings are equal (case-sensitive)");
        } else {
            System.out.println("Strings are not equal (case-sensitive)");
        }

        if (s1.equalsIgnoreCase(s2)) {
            System.out.println("Strings are equal (case-insensitive)");
        } else {
            System.out.println("Strings are not equal (case-insensitive)");
        }

        System.out.print("Concatenated: " + s1 + " " + s2);
    }
}