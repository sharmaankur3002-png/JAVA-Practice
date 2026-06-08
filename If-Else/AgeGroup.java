// Create a program that categorize a person into different age groups
// Child -> below 13 Teen -> below 20
// Adult -> below 60 // Create a program that categorize a person into different age groups
// Child -> below 13 Teen -> below 20
// Adult -> below 60 Senior-> above 60

import java.util.Scanner;

public class AgeGroup {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("--- Categorize a Person into Different Age Groups ---");
        System.out.print("Enter your age : ");
        int age = input.nextInt();

        if (age < 0 || age > 200) {
            System.out.println("INVALID INPUT !");
        } else if (age < 13) {
            System.out.println("Child");
        } else if (age < 20) {
            System.out.println("Teen ");
        } else if (age < 60) {
            System.out.println("Adult");
        } else {
            System.out.println("Senior");
        }
    }
}
