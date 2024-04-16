package LambdaExpressions.FindMaxElement;

import LambdaExpressions.MyFunc;

public class Demo {
    public static void main(String[] args) {
        MyFunc findMax = (arr)->{
            int max = arr[0];
            for (Integer i : arr){
                if (max < i){
                    max = i;
                }
            }
            return max;
        };

        Integer[] integers = new Integer[]{1,2,100,52,12,51};
        System.out.println(findMax.func(integers));
    }
}
