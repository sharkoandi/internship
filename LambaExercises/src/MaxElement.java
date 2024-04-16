import java.util.Arrays;

public class MaxElement {

    interface MaxElArray{

        int max(int[] arr);
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};

        MaxElArray maxElArray = (int[] x) -> {

            int max;
            return max = Arrays.stream(x).max().getAsInt();

        };

        System.out.println("Max el:"+maxElArray.max(arr));

    }
}
