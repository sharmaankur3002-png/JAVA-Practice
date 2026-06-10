
// Create a program using continue to sum all positive numbers entered by the user; 
// skip any negative numbers.


import java.util.Scanner;

public class SumPositive{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        System.out.print("ENTER NUMBER YOU WANT TO ADD = ");
        int num = input.nextInt();
        int sum = 0;

        for(int i=1 ; i <= num ; i++){
            System.out.print("Enter number "+ i + " : ");
            int series = input.nextInt();
            
            if(series<0){
                continue;
            }
            sum+=series ;
        } 

        System.out.println("TOTAL = " + sum);
    }
}