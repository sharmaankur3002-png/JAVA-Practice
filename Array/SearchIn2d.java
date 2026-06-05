
// Q-- Create a program to search an element in a 2-D array.

import java.util.Scanner;

public class SearchIn2d{

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("-- SEARCHING IN 2D ARRAY --");
        int[][] array2d =create2dArray();

        System.out.print("Enter Number For Search :");
        int searchNumber = input.nextInt();

        boolean inArray = isSearch2d(array2d, searchNumber);

        if(inArray){
            System.out.println("Number Is In Array !");
        }else{
            System.out.println("Number is Not In Array !");
        }

    }

    public static int[][] create2dArray(){

        System.out.println("Enter size of 2D Array = ");
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Rows Number :");
        int rows = input.nextInt();
        System.out.print("Enter Columns Number :");
        int columns = input.nextInt();
        

        int[][] numarray = new int[rows][columns]; 

        for(int i=0 ; i < rows; i++){
            for (int j = 0 ; j < columns ; j++){
                System.out.print("Enter Element Row" + (i+1) + ",colum" + (j+1) + ":");
                numarray[i][j] = input.nextInt(); 
            }
            
        }
    return numarray;
    }
    public static boolean isSearch2d(int[][] array2d , int searchNumber){
        
        for(int i=0 ; i < array2d.length ; i++){
            for(int j = 0; j< array2d[i].length ; j++){
                if (array2d[i][j]==searchNumber){
                    return true;
                }
            }
        }
        return false ;

    }

}
