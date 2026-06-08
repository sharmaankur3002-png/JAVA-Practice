
// Create a program that determines if a number is positive, negative,or zero.
import java.util.Scanner;

public class numCheck {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("enter number for checking :");

        double num = sc.nextDouble();

        if (num == 0) {
            System.out.print("your number " + num + " is zero.");
        } else if (num > 0) {
            System.out.print("your number " + num + " is positive.");
        } else {
            System.out.println("your number " + num + " is negative.");
        }
   
    }
}
