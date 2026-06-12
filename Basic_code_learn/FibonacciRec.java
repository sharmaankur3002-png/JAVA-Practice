// Create a program using recursion to display the Fibonacci series upto a certain number.

import java.util.Scanner;

public class FibonacciRec {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("--- FIBONAACI SERIES PRINT BY RECUSION ---");

        System.out.print("ENTER NUMBER OF SERIES YOU WANT = ");
        int series = input.nextInt();

        for (int i = 0; i < series; i++) {
            System.out.print(fib(i) + " ");
        }

    }

    public static int fib(int n) {

        if (n == 0) {
            return 0;
        }

        if (n == 1) {
            return 1;
        }

        return fib(n - 1) + fib(n - 2);

    }
}
