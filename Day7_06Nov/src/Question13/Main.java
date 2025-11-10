package Question13;

public class Main {

    public static void main(String[] args) {
        int[] arr = {10, 20, 30};

        try {
            // Outer try block — may throw ArrayIndexOutOfBoundsException
            System.out.println("Accessing array element...");

            try {
                // Inner try block — may throw ArithmeticException
                int result = 10 / 0; // This will throw ArithmeticException
                System.out.println("Result: " + result);

            } catch (ArithmeticException e) {
                System.out.println("Inner Catch: Cannot divide by zero!");
            }

            // This line may throw ArrayIndexOutOfBoundsException
            System.out.println(arr[5]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Outer Catch: Array index is out of range!");
        }

        System.out.println("Program ended normally.");
    }
    }

