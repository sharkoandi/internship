package Arrays_Loops;

import java.util.Random;

public class SecondLargestNumber {

    public static void main(String[] args) {
        Random r = new Random();

        int arraySize = r.nextInt(10, 20);

        int[] array = new int[arraySize];

        for(int i = 0; i < arraySize; i++){
            array[i] = r.nextInt(-100, 100);
        }

        System.out.println("Array:");

        for(int i = 0; i < arraySize; i++){
            System.out.print(array[i]);
            if(i+1 < arraySize) System.out.print(",");
        }

        int first = 0, second = 1, i = 2, temp = 0;

        while(i<arraySize){

            if(array[i] > array[first]) {
                //replace the index of largest, and store it in a temp variable to compare to second
                temp = first;
                first = i;
            }

            //replace the index of second largest if found
            if(array[temp] > array[second]){
                second = temp;
            }

            i++;
        }

        System.out.println("\nFirst largest: " + array[first]);
        System.out.println("Second largest: " + array[second]);
    }
}
