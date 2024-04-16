import java.util.Arrays;
import java.util.List;

public class ElFactorial {

    interface Factorial{

        int[] factorials(int[] arr);
    }

    public static int getFactorial(int n){

        if (n<0) return 0;
        int f=1;
        for (int i=2;i<=n;i++){
            f*=i;
        }
        return f;
    }
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};

        Factorial factorial = (int[] x) -> {

          return Arrays.stream(x).map(i -> getFactorial(i) ).toArray();

        };

        System.out.println("Faktrorialet e array:"+ Arrays.toString(factorial.factorials(arr)));

    }
}
