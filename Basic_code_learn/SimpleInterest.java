
import java.util.Scanner;

public class SimpleInterest{
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        
        System.out.println("SIMPLE INTREST CALCULATER ");

        System.out.print("ENTER VALUE OF P = ");
        double P = input.nextDouble();

        System.out.print("ENTER VALUE OF T = ");
        double T = input.nextDouble();

        System.out.print("ENTER VALUE OF R = ");
        double R = input.nextDouble();



        System.out.print("Simple Interest = "+ ((P*T*R)/100) );



    }
}