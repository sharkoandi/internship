package LambdaExpressions;

import java.util.Random;

public class FindMaxElement {

    public static void main(String[] args) {

        Random r = new Random();

        int arraySize = r.nextInt(10, 20);

        Double[] arr = new Double[arraySize];

        for(int i = 0; i < arraySize; i++){
            arr[i] = r.nextDouble(0, 100);
        }

        ElementInterface<Double> element = array -> {

            Double maxValue = Double.MIN_VALUE;

            for (Double d:
                 array) {
                if(d > maxValue)
                    maxValue = d;
            }
            return maxValue;
        };

        System.out.println(element.getElement(arr));
    }
}
