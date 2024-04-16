package LambdaExpressions;

import java.util.Arrays;

public class CalculateFactorial {

    public static void main(String[] args) {

        Integer[] arr = new Integer[]{2,3,4,5,6};

        ElementsInterface<Integer> factorial= array -> {

            Integer[] factorialArray = new Integer[array.length];

            for (int i = 0; i < array.length; i++) {
                factorialArray[i] = getFactorial(array[i]);
            }

            return factorialArray;
        };

        System.out.println(Arrays.toString(factorial.getElement(arr)));
    }

    private static Integer getFactorial(Integer i) {

        return i <= 1 ? 1 : i * getFactorial((i-1));
    }
}
