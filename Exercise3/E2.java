package Exercise3;

public class E2 {
    public static void main(String[] args) {
        int[] arr = new int[]{1,5,6,8,100,20};

        //testoj max
        System.out.println(findLargest(arr));

        //testoj fsl
        System.out.println(findSecondLargest(arr));
    }

    static int findSecondLargest(int[] arr){
        int toAvoid = findLargest(arr);

        int max = arr[0];
        int l = arr.length;

        for (int i = 1 ; i < l ; i++){
            if (arr[i] == toAvoid){
                continue;
            }
            if (arr[i] > max){
                max = arr[i];
            }
        }

        return max;
    }

    static int findLargest(int[] arr){
        int max = arr[0];
        int l = arr.length;

        for (int i = 1 ; i < l ; i++){
            if (arr[i] > max){
                max = arr[i];
            }
        }

        return max;
    }
}
