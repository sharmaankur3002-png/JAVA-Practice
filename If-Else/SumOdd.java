// Create a program to sum all odd numbers from 1 to a specified number N.

import java.util.Scanner;

public class SumOdd {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("--- SUM ODD NUMBER ---:");

        System.out.print("Enter a number : ");

        int N = sc.nextInt();

        if (N < 0) {
            System.out.println("INVALID INPUT !");
            return;
        }
        int sum = 0;
        for (int i = 1; i <= N; i += 2) {
            sum += i;
        }

        System.out.println("Sum of all odd number = " + sum);

    }
}
