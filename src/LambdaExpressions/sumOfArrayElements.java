package LambdaExpressions;

import java.util.Random;

public class sumOfArrayElements {

    public static void main(String[] args) {

        Random r = new Random();

        int arraySize = r.nextInt(10, 20);

        Integer[] arr = new Integer[arraySize];

        for(int i = 0; i < arraySize; i++){
            arr[i] = r.nextInt(0, 100);
        }

        ElementInterface<Integer> sumOfElements = (array) -> {
            Integer sum = 0;

            for (Integer i:
                array ) {
                sum += i;
            }

            return sum;
        };

        System.out.println(sumOfElements.getElement(arr));
    }
}
