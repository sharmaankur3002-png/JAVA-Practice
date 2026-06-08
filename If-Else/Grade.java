
// Create a program that calculates grades based on marks
// A -> above 90% B -> above 75%
// C -> above 60% D -> above 30%
// F -> below 30% 

import java.util.Scanner;

public class Grade{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("--- CHECK YOUR GRADE ---");
        System.out.print("Enter Marks(%) For Check Grade : ");
        int marks = input.nextInt();

        if (marks<0 || marks > 100){
            System.out.println("INVALID INPUT !");
        }else if(marks>90){
            System.out.println("YOUR GRADE = A" );
        }else if(marks>75){
            System.out.println("YOUR GRADE = B" );
        }else if(marks>60){
            System.out.println("YOUR GRADE = C" );
        }else if(marks>=30){
            System.out.println("YOUR GRADE = D" );
        }else{
            System.out.println("YOUR GRADE = F");
        }
   
    }
}