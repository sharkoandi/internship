package LambdaExpressions;

import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {
        GetArrayReturnList removeDuplicate =
                (array)->{
                  Set set = new HashSet();
                  for (int i = 0; i < array.length;i++){
                      set.add(array[i]);
                  }
                  return new ArrayList(set);
                };

        Integer[] integers = new Integer[]{1,1,2,3,3,4,5};
        List nonDup = removeDuplicate.apply(integers);
        Iterator iterator = nonDup.listIterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next() + " ");
        }
    }
}
