
import java.util.Scanner;

public  class MultiplicationTable{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("--- MULTIPLICATION TABLE ---");
        System.out.print("ENTER NUMBER FOR YOU WANT TABLE = ");
        int number  = input.nextInt();

        if (number<0){
            System.out.println("INVALID INPUT !");
            return;
        }

        System.out.printf("--- TABLE OF %d --- %n" ,number);

        for(int i=1 ; i <= 10 ; i++){
            System.out.println(number + " * " + i + " = " + (number*i));
        }
    }
}