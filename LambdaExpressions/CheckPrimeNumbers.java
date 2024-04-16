package LambdaExpressions;

import java.util.function.Predicate;

public class CheckPrimeNumbers {
    public static void main(String[] args) {
        PredicateOfArrays<Integer> isPrime = (Integer[] integers)-> {
            for (Integer i : integers) {
                if (i <= 1) {
                    return false;
                }
                for (int j = 2; i < Math.sqrt(i); j++) {
                    if (i % j == 0) {
                        return false;
                    }
                }
            }
            return true;
        };

        Integer[] integers = new Integer[]{3,5,7};
        System.out.println(isPrime.test(integers));
    }
}
