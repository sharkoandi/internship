public class MaxOfArray {
    int[] arr = {1, 2, 3};

    ApplyMax maxArray = (array) -> {
        int max = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    };

    public int findMax() {
        return maxArray.apply(arr);
    }

    public static void main(String[] args) {
        MaxOfArray maxOfArray = new MaxOfArray();
        int max = maxOfArray.findMax();
        System.out.println("Maximum value in the array: " + max);
    }
}
