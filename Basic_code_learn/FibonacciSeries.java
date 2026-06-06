
// Q-- Write a program to generate Fibonacci series.
import java.util.Scanner;

public class FibonacciSeries {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("How many Fibonacci numbers do you want : ");
        int series = input.nextInt();

        if (series <= 0) {
            System.out.println("Please enter a positive number.");
            return;
        }

        int a = 0;
        int b = 1;
        for (int i = 0; i < series; i++) {

            System.out.print(a + " ");

            int temp = a + b;
            a = b;
            b = temp;

        }

    }
}
