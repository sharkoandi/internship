import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class SquareOfEl {

    interface Sqr{

        List<Integer> sqrOfEl(int[] arr);
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};

        Sqr sqrt = (int[] x) -> {

            return Arrays.stream(x).map(i -> i*i).boxed().toList();

        };

        System.out.println("Square root of elements:"+sqrt.sqrOfEl(arr));
    }
}
