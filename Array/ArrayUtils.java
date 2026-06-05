
import java.util.Scanner;


public class ArrayUtils {


// CREATE 1D ARRRAY CODE -

    public static int[] createArray() {

        Scanner input = new Scanner(System.in);
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

// PRINT 1D ARRAY CODE-

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

// CREATE 2D ARRAY CODE -

    public static int[][] create2dArray() {

        System.out.println("Enter size of 2D Array = ");
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Rows Number :");
        int rows = input.nextInt();
        System.out.print("Enter Columns Number :");
        int columns = input.nextInt();

        int[][] numarray = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Enter Element Row" + (i + 1) + ",colum" + (j + 1) + ":");
                numarray[i][j] = input.nextInt();
            }

        }
        return numarray;
    }

}
