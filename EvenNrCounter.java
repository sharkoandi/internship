import java.util.Arrays;

public class EvenNrCounter {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6,9,30,40};

        EvenCheck isEven = num -> num % 2 == 0;

        long evenCount = countEvenNumbers(numbers, isEven);

        System.out.println("Number of even elements is : " + evenCount);
    }

    public static long countEvenNumbers(int[] numbers, EvenCheck isEven) {
        return Arrays.stream(numbers)
                .filter(isEven::check)
                .count();
    }
}
