
// Q-- Create a program using for-each to the occurrences of a specific element in an array.

import java.util.Scanner;

public class Occurrences {

    public static void main(String[] args) {
        System.out.println("-- Occurrences of a specific element in an array --- ");

        int[] array = ArrayUtils.createArray();

        Scanner input = new Scanner(System.in);

        System.out.print("Enter element = ");
        int num = input.nextInt();

        int occ = 0;
        for (int number : array) {

            if (num == number) {
                occ++;
            }
        }
        System.out.println(num + " occurrences in array = " + occ);

    }
}
