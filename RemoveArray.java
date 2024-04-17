import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveArray {
    public static Integer[] removeDuplicates(Integer[] arr1, RemoveDuplicateArray remover) {
        return remover.remove1(arr1);
    }

    public static void main(String[] args) {
        Integer[] arr = {3, 2, 3, 3, 2, 6, 5, 6, 7, 9, 8, 9};

        Integer[] uniqueArray = removeDuplicates(arr, array -> {
            Set<Integer> uniqueElements = new LinkedHashSet<>(Arrays.asList(array));
            return uniqueElements.toArray(new Integer[0]);
        });


        System.out.println("Array pa elementet e dublikuar:");
        for (Integer num : uniqueArray) {
            System.out.print(num + " ");
        }
    }
}
