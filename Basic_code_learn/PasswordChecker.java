
// Create a program using do-while to find password checker until a valid password is entered.

import java.util.Scanner;

public class PasswordChecker {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("---- WELCOME IN PASSWORD CHECKER ----");

        String password;

        do {
            System.out.print("ENTER YOUR PASSWORD : ");
            password = input.nextLine();

            if (!verify(password)) {
                System.out.println("Password must contain at least 8 characters(LIMIT-15).");
            }
        } while (!verify(password));

        System.out.println("Your password has been set successfully.");
    }

    public static boolean verify(String password) {

        if (password.length() >= 8 && password.length() <= 15) {
            return true;
        }
        return false;
    }

}
