package Arrays_Loops;

import java.util.ArrayList;
import java.util.Random;

public class ReverseArray {

    public static void main(String[] args) {
        Random r = new Random();

        int arraySize = r.nextInt(10, 20);

        int[] array = new int[arraySize];

        //filling the array
        for(int i = 0; i < arraySize; i++){
            array[i] = r.nextInt(-100, 100);
        }

        System.out.println("Array before reversing:");

        for(int i = 0; i < arraySize; i++){
            System.out.print(array[i]);
            if(i+1 < arraySize) System.out.print(",");
        }

        System.out.println("\nArray after reversing: ");

        for(int i = 0; i < arraySize/2; i++){

            int temp = array[i];
            array[i] = array[arraySize-i-1];
            array[arraySize-i-1] = temp;

        }

        for(int i = 0; i < arraySize; i++){
            System.out.print(array[i]);
            if(i+1 < arraySize) System.out.print(",");
        }
    }
}
