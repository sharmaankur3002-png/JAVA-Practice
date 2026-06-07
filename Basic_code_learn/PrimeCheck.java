// Q-- Write a program to check whether a number is prime or not.

import java.util.Scanner;

public class PrimeCheck {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("--- FIND NUMBER IS PRIME OR NOT ! ---");

        System.out.print("ENTER NUMBER : ");
        int num = input.nextInt();
        boolean isPrime = true;

        if (num <= 1) {
            System.out.println("NUMBER IS NOT PRIME !");
            return;
        }

        for (int i = 2; i*i <= num; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;

            }
        }

        if (isPrime) {
            System.out.println("NUMBER IS PRIME !");
        } else {
            System.out.println("NUMBER IS NOT PRIME !");
        }

    }

}
