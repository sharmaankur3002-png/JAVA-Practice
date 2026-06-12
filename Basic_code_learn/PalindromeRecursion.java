
// Create a program using recursion to check if a string is a palindrome using recursion.
import java.util.Scanner;

public class PalindromeRecursion {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("--- CHECK STRING PALINDROME BY RECURSION --- ");
        System.out.print("ENTER WORD : ");

        String word = input.next();

        if (palRec(word)) {
            System.out.println("WORD IS PALINDROME !");

        } else {
            System.out.println("WORD IS NOT PALINDROME !");

        }

    }

    public static boolean palRec(String word) {
        if (word.length() <= 1) {
            return true;
        }

        if (word.charAt(0) != word.charAt(word.length() - 1)) {
            return false;
        }

        return palRec(word.substring(1, word.length() - 1));
    }
}
