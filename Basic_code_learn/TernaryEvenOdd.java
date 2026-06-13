
// Create a program to find if the given number is even or odd.

import java.util.Scanner;

public class TernaryEvenOdd{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("=== Find number is even or odd using ternary ===");

        System.out.print("ENTER NUMBER = ");
        int num = input.nextInt();


        String oddEven = (num % 2 == 0) ? "Even" : "Odd" ;

       System.out.println(num +" is an " + oddEven + " Number.");
    }
}