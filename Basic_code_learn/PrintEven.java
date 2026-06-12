// Q-- Create a program using continue to print only even numbers using continue for odd numbers .

import java.util.Scanner;

public class PrintEven {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("--- PRINT EVEN NUMBER ONLY ---");

        System.out.print("How many numbers do you want to enter? ");
        int series = input.nextInt();

        String evenNumber = " ";

        for (int i = 1; i <= series; i++) {
            System.out.print("Enter number " + i + " : ");
            int num = input.nextInt();

            if (num % 2 != 0) {
                continue;
            }
            evenNumber += num + " ";
        }
        System.out.println("EVEN NUMBERS = " + evenNumber);

    }
}
