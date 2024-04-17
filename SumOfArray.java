public class SumOfArray {

        public static void main(String[] args) {

            int[] arr = {1, 2, 3};

            ApplyArray sumArray = (array) -> {
                int sum = 0;

                for (int i = 0; i < array.length; i++) {
                    sum += array[i];
                }
                return sum;

            };
            int sum = sumArray.apply1(arr);

            System.out.println("Sum of array elements: " + sum);
        }
    }

