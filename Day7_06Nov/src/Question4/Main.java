package Question4;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Reverse the digits of an integer using a while loop.
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int reversed = 0;

        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num = num / 10;
        }

        System.out.println("Reversed number: " + reversed);
    }
}
