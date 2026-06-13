
// Create a program to calculate the absolute value of a given integer

import java.util.Scanner;

public class Absolutevalue {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("=== Absolute value of a given integer ===");

        System.out.print("ENTER NUMBER = ");
        int num = input.nextInt();

        int result = (num < 0) ? -(num) : num;

        System.out.println(" Absolute value of number = " + result);

    }
}
