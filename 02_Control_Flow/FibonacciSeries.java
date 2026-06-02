import java.util.Scanner;

class FibonacciSeries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter starting number: ");
        int startNum = input.nextInt();
        System.out.print("Enter limit: ");
        int endNum = input.nextInt();

        int nextNum = startNum + 1, temp;
        while (startNum <= endNum) {
            System.out.print(startNum + " ");
            temp = startNum;
            startNum = startNum + nextNum;
            nextNum = temp;
        }
    }
}