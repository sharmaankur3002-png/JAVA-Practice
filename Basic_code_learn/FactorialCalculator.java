
// Q-- Write a program to find the factorial of a number.
import java.util.Scanner;

public class FactorialCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("--- Find Factorial Of Any Number ---");

        System.out.print("Enter Number = ");
        long num = input.nextLong();

        if (num < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
            return;

        }

        long factorial = 1;
        for (long i = num; i >= 1; i--) {
            factorial *= i;
        }
        System.out.println("Number " + num + " factorial = " + factorial);

    }

}
