// Q-- Create a program to find the maximum and minimum element in an array.

import java.util.Scanner;

public class MaxAndMin {

    public static void main(String[] args) {

        int[] array = createArray();
        int max = maxNum(array);
        int min = minNum(array);

        System.out.println("your array max number = " + max);
        System.out.println("your array min number = " + min);

    }

    public static int[] createArray() {

        Scanner input = new Scanner(System.in);

        System.out.println("--CHECK ARRAY MAX AND MN NUMBER--");

        System.out.print("Enter Size Of Array : ");

        int size = input.nextInt();

        while (size <= 0) {

            System.out.println("INPUT IS NOT VALID !");
            System.out.print("Enter Size Of Array : ");

            size = input.nextInt();

        }

        int[] newArr = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter number in Array " + (i + 1) + ": ");
            int num = input.nextInt();
            newArr[i] = num;
        }
        return newArr;
    }

    public static int maxNum(int[] array) {

        int max = array[0];
        int i = 1;
        while (i < array.length) {
            if (array[i] > max) {
                max = array[i];
                
            }
            i++;
        }
        return max;
    }

    public static int minNum(int[] array) {

        int min = array[0];
        int i = 1;
        while (i < array.length) {
            if (array[i] < min) {
                min = array[i];
                
            }
            i++;
        }
        return min;
    }

}
