import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("COMPOUND INTEREST CALCULATOR");

        System.out.print("ENTER VALUE OF P = ");
        double P = input.nextDouble();

        System.out.print("ENTER VALUE OF T = ");
        double T = input.nextDouble();

        System.out.print("ENTER VALUE OF R = ");
        double R = input.nextDouble();

        double amount = P * Math.pow((1 + (R / 100)), T);
        double compoundInterest = amount - P;

        System.out.println("Amount = " + amount);
        System.out.println("Compound Interest = " + compoundInterest);

    }
}