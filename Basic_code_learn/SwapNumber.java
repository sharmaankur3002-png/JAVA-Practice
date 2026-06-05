// Q-- Write a program to swap two numbers without using a third variable.

import java.util.Scanner;

public class SwapNumber{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("--- SWAP TWO NUMBERS ---");

        System.out.print("ENTER NUMBER 1 : "); 
        int num1 = input.nextInt();

        System.out.print("ENTER NUMBER 2 : "); 
        int num2 = input.nextInt();

        num1 = num1+num2 ;
        num2 = num1-num2;
        num1 = num1-num2;
        
        System.out.println("NUMBER 1 = "+ num1 + "\nNUMBER 2 = " + num2);

    }
  
}