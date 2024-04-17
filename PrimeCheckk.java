public class PrimeCheckk {
    public static void main(String[] args) {
        int[] numbers = {2, 3, 4, 5, 6, 7, 8, 9, 10};


       CheckPrime isPrime = n -> {
            if (n <= 1) return false;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) return false;
            }
            return true;
        };


        checkPrimeNumbers(numbers, isPrime);
    }
    public static void checkPrimeNumbers(int[] numbers, CheckPrime isPrime) {
        for (int i = 0; i < numbers.length; i++) {
            int num = numbers[i];
            if (isPrime.check(num)) {
                System.out.println(num + " is prime");
            } else {
                System.out.println(num + " is not prime");
            }
        }

    }
}


