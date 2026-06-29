class BuiltInExceptionsDemo {
    public static void main(String[] args) {
        // ArithmeticException — division by zero
        try {
            int result = 9 / 0;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: " + e.getMessage());
        }

        // ArrayIndexOutOfBoundsException — accessing invalid index
        try {
            int[] arr = {1, 2, 3};
            System.out.println(arr[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException: " + e.getMessage());
        }

        // StringIndexOutOfBoundsException — accessing invalid char position
        try {
            String name = "Manan";
            System.out.println(name.charAt(50));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException: " + e.getMessage());
        }
    }
}
