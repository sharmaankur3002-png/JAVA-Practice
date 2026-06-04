// Q-- Create a program to check if the given array is sorted .

public class CheckSorted {

    public static void main(String[] args) {

        System.out.println("-- CHECK YOUR ARRAY IS SORTED OR NOT !! -- ");

        int[] array = ArrayUtils.createArray();
        boolean increase = incSort(array);
        boolean decrease = decSort(array);

        if (increase || decrease) {
            System.out.println("Array is sorted.");
        } else {
            System.out.println("Array is not sorted.");
        }
    }

    public static boolean incSort(int[] array) {

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                return false;
            }
            

        }
        return true;
    }
            

    

    public static boolean decSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++){
            if (array[i] < array[i + 1]) {
                return false;
            }
        }
        return true;
    }
}

