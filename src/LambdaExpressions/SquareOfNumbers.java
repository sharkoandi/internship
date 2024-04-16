package LambdaExpressions;

import java.util.Arrays;

public class SquareOfNumbers {

    public static void main(String[] args) {

        Integer[] arr = new Integer[]{1, 2, 3, 4, 5, 6, 7};

        ElementsInterface<Integer> squared = array -> {

            Integer[] sq = new Integer[array.length];

            for (int i = 0; i < array.length; i++) {
                sq[i] = array[i] * array[i];
            }

            return sq;
        };

        System.out.println(Arrays.toString(squared.getElement(arr)));
    }
}
