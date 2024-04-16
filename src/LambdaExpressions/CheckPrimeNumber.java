package LambdaExpressions;

public class CheckPrimeNumber {

    public static void main(String[] args) {

        Integer[] arr = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        ElementInterface<Integer> checkPrime = array -> {

            for (Integer i:
                 array) {
                if(!isPrime(i))
                    return -1;
            }

            return 1;
        };

        System.out.println(checkPrime.getElement(arr) == 1 ? "All elements are prime" : "Not all Elelemts are prime");
    }

    private static boolean isPrime(Integer i) {

        for (int j = 2; j < i; j++) {
            if(i % j == 0) return false;
        }

        return true;
    }
}
