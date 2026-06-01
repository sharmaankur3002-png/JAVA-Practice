
import java.util.Scanner;

public class AddNumber{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter numbers you want to add :");
        int nums= input.nextInt();

        int sum = 0;

        for (int i=0; i<nums; i++){
            System.out.print("ENTER NUMBER " + ( i+1)+ (":"));

            int dig = input.nextInt();

            sum+=dig;
        }

        System.out.println("Sum of your numbers = "+ sum );

    }
  

}