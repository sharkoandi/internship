package LambdaExpressions;

import java.util.ArrayList;
import java.util.List;

public class FilterEvenIndexes {
    public static void main(String[] args) {
        Integer[] integers = new Integer[]{1,2,3,4,5,6,7,8,9};
        List<?> list = filter.func(integers);
        for (Object o : list){
            System.out.print(o + " ");
        }
    }
    static Filter filter = (array)->{
        ArrayList<Object> arrayList = new ArrayList<>();
        for (int i=2;i<array.length;i++){
            if (i % 2 == 0){
                arrayList.add(array[i]);
            }
        }
        return arrayList;
    };
}
