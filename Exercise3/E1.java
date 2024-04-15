package Exercise3;

public class E1 {
    public static void main(String[] args) {
        int arr[] =  new int[]{1,5,8,2,3,4};
        reverseArray(arr);
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }

    static void reverseArray(int[] arr){
        int l = arr.length;

        for (int i = 0; i < l / 2 ; i++){
            int temp = arr[i];
            arr[i] = arr[l - 1 - i];
            arr[l - 1 - i] = temp;
        }
    }
}
