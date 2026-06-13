// Create a program to Based on a student's score, categorize as "High", "Moderate", or "Low" 
// using the ternary operator (e.g., High for scores > 80, Moderate for 50-80, Low for < 50).

import java.util.Scanner;

public class TernaryScore{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("=== Give score according marks using ternary ===");

        System.out.print("Enter your marks = ");
        int num = input.nextInt();

        if (num>100 || num < 0){
            System.out.println("invalid input !");
            return ;
        }


        String score = (num > 80) ? "high" : (num < 50) ? "low" : "moderat" ;

        System.out.println("Score : " + score );
    }
}