package LambdaExpressions;

import java.util.Random;

public class CountEvenNumbers {

    public static void main(String[] args) {

        Random r = new Random();

        int arraySize = r.nextInt(10, 20);

        Integer[] array = new Integer[arraySize];

        for (int i = 0; i < arraySize; i++){
            array[i] = r.nextInt(0, 200);
        }

        ElementInterface<Integer> getSumOfEven = arr -> {

            Integer sum = 0;

            for (Integer i:
                 arr) {
                if(i%2 == 0)
                    sum += i;
            }

            return sum;
        };

        System.out.println(getSumOfEven.getElement(array));

    }
}
