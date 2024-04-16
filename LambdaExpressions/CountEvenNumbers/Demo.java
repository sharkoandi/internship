package LambdaExpressions.CountEvenNumbers;

import LambdaExpressions.MyFunc;

public class Demo {
    public static void main(String[] args) {
        Integer[] integers = new Integer[]{1,2,3,4,5,6,7,8,9,10};

        int total = countEvenNumbers((arr)->{
            int count = 0;
            for (Integer i : arr){
                if (i % 2 == 0){
                    count++;
                }
            }
            return count;
        },integers);

        System.out.println(total);
    }

    static int countEvenNumbers(MyFunc myFunc,Integer[] arr){
       return myFunc.func(arr);
    }
}
