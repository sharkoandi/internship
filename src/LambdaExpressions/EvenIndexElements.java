package LambdaExpressions;

import java.util.Arrays;

public class EvenIndexElements {

    public static void main(String[] args) {

        Integer[] arr = new Integer[]{2,3,4,5,6};

        ElementsInterface<Integer> getEven = array -> {

            Integer[] evenArray = new Integer[array.length/2+1];
            int j = 0;
            for (int i = 0; i < array.length; i= i+2) {
                evenArray[j++] = array[i];
            }

            return evenArray;
        };

        System.out.println(Arrays.toString(getEven.getElement(arr)));
    }
}
