import java.util.Arrays;
import java.util.List;

public class PrimeNumbers {

    interface Prime{

        List<Boolean> arePrime(int[] arr);

    }

    public static boolean isPrime(int n){

        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;

    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};

        Prime prime = (int[] x) -> {

            return Arrays.stream(x)
                    .mapToObj(i -> isPrime(i)).toList();
        };

        System.out.println(Arrays.toString(arr));
        System.out.println(prime.arePrime(arr));



    }
}
