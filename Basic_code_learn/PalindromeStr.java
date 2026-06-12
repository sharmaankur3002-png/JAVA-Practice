
// Create a program to check if a string is a palindrome .


import java.util.Scanner;

public class PalindromeStr {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("--- CHECK STRING PALINDROME --- ");
        System.out.print("ENTER WORD :");

        String word = input.next();
        String reverse = "";

        for (int i = word.length() - 1; i >= 0;) {

            reverse += word.charAt(i);
            i--;

        }

        if (word.equals(reverse)) {

            System.out.println("word is palindrome.");
        } else {
            System.out.println("word is not palindrome !");
        }
    }
}
