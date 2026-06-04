
import java.util.Scanner;

public class ArrayUtils {

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
  public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
    }


