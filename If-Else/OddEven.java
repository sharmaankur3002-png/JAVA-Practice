
// Create a program that determines if a number is odd or even.
import java.util.Scanner;

public class OddEven {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("--- ODD EVEN NUMBER CHECK ---:");

        System.out.print("Enter number for checking : ");

        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.print("your number " + num + " is Even.");
        } else {
            System.out.print("your number " + num + " is Odd.");
        }
    }
}
