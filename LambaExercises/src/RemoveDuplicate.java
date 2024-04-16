import java.util.Arrays;
import java.util.List;

public class RemoveDuplicate {

    interface Duplicates{

        int[] removeDuplicate(int[] arr);
    }

    public static void main(String[] args) {

        int[] arr = {1, 1, 2, 2, 3, 3, 4, 4, 5, 5};

        Duplicates duplicates = (int[] x) -> {

            return Arrays.stream(x).distinct().toArray();

        };

        System.out.println("Pa duplicates:"+ Arrays.toString(duplicates.removeDuplicate(arr)));
    }
}
