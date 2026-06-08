// Create a program that determines if a given year is a leap year .

import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("--- CHECK YEAR IS LEAP ---");
        System.out.print("Enter year for check: ");
        int year = input.nextInt();

        if (year % 400 == 0) {
            System.out.println("year is leap");
        } else if (year % 100 == 0) {
            System.out.println("year is not leap year");
        } else if (year % 4 == 0) {
            System.out.println("year is leap");
        } else {
            System.out.println("year is not leap");
        }

    }
}
