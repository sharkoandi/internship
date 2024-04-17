import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FilterEven {
    public static List<Integer> filterEvenNumbers(List<Integer> numbers, Filter filter) {
        return filter.filter(numbers);
    }
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 4,5,6,7,8,9,10);

        List<Integer> evenNumbers = filterEvenNumbers(numbers, nums -> {
            List<Integer> result1 = new ArrayList<>();
            for (int i = 0; i < nums.size(); i++) {
                int number = nums.get(i);
                if (number % 2 == 0) {
                    result1.add(number);
                }
            }
            return result1;
        });


        System.out.println("Even numbers are:");
        for (int i = 0; i < evenNumbers.size(); i++) {
            System.out.print(evenNumbers.get(i) + " ");

        }
        System.out.println();
    }
}