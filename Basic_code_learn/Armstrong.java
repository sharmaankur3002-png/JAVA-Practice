// Q-- Armstrong number check.  

import java.util.Scanner;

public class Armstrong {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("--- Armstrong number check ---");
        System.out.print("Enter Number = ");
        int num = input.nextInt();
        if (num < 0) {
            System.out.println("Please enter a non-negative number.");
            return;
        }
        int check = num;
        int NumberCount = count(num);
        int armstrongNumber = powerSum(NumberCount, num);

        if (check == armstrongNumber) {
            System.out.println("Entered Number Is an Armstrong Number!");
        } else {
            System.out.println("Entered Number Is not an Armstrong Number!");
        }
    }

    public static int count(int num) {
      
        int countnum = 0;
        while (num > 0) {
            num /= 10;
            countnum++;
        }
        return countnum;
    }

    public static int powerSum(int count, int num) {
        int sum = 0;

        while (num > 0) {
            int temp = num % 10;
            int square = 1;

            for (int j = 0; j < count; j++) {
                square *= temp;
            }
            sum += square;
            num /= 10;
        }
        return sum;
    }
}
