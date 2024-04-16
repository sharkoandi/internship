package LambdaExpressions.SumOfArrayElements;

import LambdaExpressions.MyFunc;

class SumOfArray{
    static Integer calculateSum(MyFunc myFunc, Integer[] arr){
       return myFunc.func(arr);
    }
}

class Demo {

    public static void main(String[] args) {
        MyFunc sumFunc = (Integer[] arr)->{
            Integer sum = 0;
            for (Integer i: arr){
                sum += i;
            }
            return sum;
        };
        System.out.println(SumOfArray.calculateSum(sumFunc,new Integer[]{1,2,3}));
    }
}
