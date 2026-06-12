// Q-- Create a program using for-each to find the maximum value in an integer array.

public class MaxNumber {

    public static void main(String[] args) {
        System.out.println("-- FIND MAX NUMBER IN ARRAY --- ");

        int[] array = ArrayUtils.createArray();

        int max = array[0];

        for (int num : array) {

            if (num > max) {
                max = num;
            }
        }

        System.out.println("max = " + max);

    }
}
