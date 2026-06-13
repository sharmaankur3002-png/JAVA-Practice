
// Create a program to find the minimum of two numbers using Ternary.
import java.util.Scanner;

public class TernaryMin {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("=== minimum of two numbers using Ternary ===");

        System.out.print("ENTER NUMBER 1 = ");
        int num1 = input.nextInt();

        System.out.print("ENTER NUMBER 2 = ");
        int num2 = input.nextInt();

        int min = (num1 < num2) ? num1 : num2;

        System.out.println("Minimum number is = " + min);

    }
}
