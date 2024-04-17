public class FactorialNumber {
    public static void main(String[] args) {
        int nr = 8;

        MyFactorial factorial = n -> {
            int result = 1;
            for (int i = 1; i <= n; i++) {
                result *= i;
            }
            return result;
        };


        int factorialfinal = factorial.factorial1(nr);

        System.out.println("Factorial of " + nr + " : " + factorialfinal);
    }
}