
// Create a program using break to read inputs from the user in a loop and break
// the loop if a specific keyword (like "exit") is entered.

import java.util.Scanner;

public class BreakUse{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;

        while (true) { 
            System.out.print("ENTER INPUT = ");
            String userInput = input.nextLine();

            if(userInput.equalsIgnoreCase("Exit")){
                 break;
            }
        }
        }
    }
