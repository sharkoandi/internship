package LambdaExpressions.SquareOfNumbers;

import LambdaExpressions.GetArrayReturnArray;

public class Main {
    public static void main(String[] args) {
        GetArrayReturnArray<Integer> squareIntegers =
                (Integer[] arr)->{
                    Integer[] squares = new Integer[arr.length];
                    for (int i = 0 ; i < arr.length; i++){
                        squares[i] =arr[i]*arr[i];
                    }
                    return squares;
                };

        Integer[] arr = new Integer[]{1,2,3,4,5};

        Integer[] sq = squareIntegers.apply(arr);

        for (Integer i : sq){
            System.out.println(i);
        }

    }

}
