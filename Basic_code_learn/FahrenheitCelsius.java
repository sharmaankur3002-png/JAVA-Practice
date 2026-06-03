
import java.util.Scanner;

public class FahrenheitCelsius{
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        
        System.out.println("convert Fahrenheit to Celsius ");

    
        System.out.print("ENTER VALUE OF °F = ");
        float F = input.nextFloat();


        float  Celsius = (F - 32) * 5/9 ;
        System.out.print("Celsius = (°F - 32) * 5/9 = "+ Celsius + " °C");



    }
}