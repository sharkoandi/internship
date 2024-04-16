import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EvenIndex {

    interface Indexes{

        List<Integer> elIndexes(int[] arr);
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};

        Indexes indexes = (int[] x) -> {

            ArrayList<Integer> index = new ArrayList<>();
            for (int i=0;i<x.length;i++){
                if (i % 2 == 0) index.add(i);
            }

            return  index;

        };

        System.out.println("Indexet cift:"+indexes.elIndexes(arr));
    }
}
