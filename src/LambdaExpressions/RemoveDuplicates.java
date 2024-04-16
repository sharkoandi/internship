package LambdaExpressions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RemoveDuplicates {

    public static void main(String[] args) {


        Integer[] arr = new Integer[]{1,2,3,4,5,6,2,3,4};

        ElementsInterface<Integer> noDublicates = array -> {

            HashMap<Integer, Integer> map = new HashMap<>();

            for (Integer i:
                 array) {
                if(!map.containsKey(i)) map.put(i, i);
            }

            Integer[] noDup = new Integer[map.keySet().size()];
            int counter = 0;
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                noDup[counter++] = entry.getKey();
            }

            return noDup;
        };

        System.out.println(Arrays.toString(noDublicates.getElement(arr)));
    }
}
