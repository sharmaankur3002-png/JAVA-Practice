
// Q-- Write a program to find the largest of three numbers.

import java.util.Scanner;

public class Largestnumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("--- FIND LARGEST NUMBER OF THREE NUMBER ---");

        System.out.print("ENTER NUMBER 1 : ");
        int num1 = input.nextInt();

        System.out.print("ENTER NUMBER 2 : ");
        int num2 = input.nextInt();

        System.out.print("ENTER NUMBER 3 : ");
        int num3 = input.nextInt();

        if (num1 >= num2 && num1 >= num3) {
            System.out.println("LARGEST NUMBER IS = " + num1);
        } else if (num2 >= num1 && num2 >= num3) {
            System.out.println("LARGEST NUMBER IS = " + num2);
        } else {
            System.out.println("LARGEST NUMBER IS = " + num3);
        }

    }
}
