
// Q-- Create a program to find the sum and average of all elements in an array.

import java.util.Scanner;

public class SumAndAverage{
    public static void main(String[] args) {

        int[] array = createArray() ;
        long sum = arraySum(array);
        double avg = arrayAvg(sum,array);


        System.out.println("Your Array Sum = " + sum );
        System.out.println("Your Array Average = " + avg);

    }

        public static int[] createArray(){

            Scanner input = new Scanner(System.in);

            System.out.println("----Sum And Average Calculator---- ");

            System.out.print("Enter Size Of Array : ");

            int size = input.nextInt();


            while(size<=0){

                System.out.println("INPUT IS NOT VALID !");
                System.out.print("Enter Size Of Array : ");

                size = input.nextInt();

            }

            int[] newArr = new int[size];

            for(int i=0; i < size; i++ ){
                System.out.print("Enter number in Array " + (i+1) + ": ");
                int num = input.nextInt();
                newArr[i] = num;
            }
            return newArr ;

    }

    public static long arraySum(int[] array){

        long sum = 0;
        for (int i=0 ; i<array.length ; i++){
            sum += array[i];
        } 
        return sum ;

    }

    public static double arrayAvg(long sum,int[] array){

        int len = array.length ;
        double avg = (double)sum/len ;

        return avg ;
    }

}

