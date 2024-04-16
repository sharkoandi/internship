import java.util.Arrays;
import java.util.stream.Collectors;

public class EvenCount {

    interface CountEven{

        int count(int[] arr);
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};

        CountEven countEven = (int[] x) -> {

            return Arrays.stream(x)
                    .filter(i -> i % 2 == 0)
                    .boxed ()
                    .toList().size();
        };

        System.out.println("Numri elementeve cift :"+ countEven.count(arr));
    }
}
