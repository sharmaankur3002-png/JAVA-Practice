
import java.util.Random;
import java.util.Scanner;

// Create a program using do-while to implement a number guessing game.

public class NumberGuess{
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);

        System.out.println("--- Number guessing game 1 to 10 ---");

        Random random = new Random();
        int num =  random.nextInt(10)+1;

        int guess;
        int count = 0 ;

        do { 
            System.out.print("Guess a number : ");
            guess = input.nextInt();

            if (guess>10 || guess < 0){
                System.out.println("Enter number between 1-10 !!");
                continue;
            }

            if(num!=guess){
                System.out.println("Guess is not correct, Try again !!");
            }
            count ++ ;
            
        } while (num!=guess);

        System.out.println("wow you guess correct number in " + count +" times .");

        
    }
}