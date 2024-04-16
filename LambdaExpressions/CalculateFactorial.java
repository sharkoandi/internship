package LambdaExpressions;

public class CalculateFactorial {
    public static void main(String[] args) {

        GetArrayReturnArray<Integer> calculateFactorial =
                (Integer[] array) -> {
                    Integer[] factorials = new Integer[array.length];
                    int index = 0;
                    for (Integer i : array) {
                      factorials[index++]=factorial(i);
                    }
                    return factorials;
                };
        Integer[] i = new Integer[]{4,3};
        i = calculateFactorial.apply(i);
        for (Integer j : i){
            System.out.println(j);
        }
    }

    static int factorial( int n){
        if (n == 0)
            return 1;

        return n * factorial(n - 1);
    }
}
