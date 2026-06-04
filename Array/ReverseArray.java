// Q-- Create a program to reverse an array.

public class ReverseArray{
    public static void main(String[] args) {

        int[] array =ArrayUtils.createArray();
        
        System.out.println("your array :");
        ArrayUtils.printArray(array);

        int[] reverse= revarray(array);

        System.out.println("Reverse Array :");
        ArrayUtils.printArray(reverse);


}

public static int[] revarray(int[]array){
    for (int i=0 ; i <array.length/2; i++){
        int temp = array[i];
        array[i]=array[array.length-1-i];
        array[array.length-1-i] = temp;

    }

    return array;
}
}