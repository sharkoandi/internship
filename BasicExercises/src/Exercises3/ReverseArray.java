package Exercises3;

public class ReverseArray {

    public static void reverse_array(int[] n)
    {
        int[] arr = new int[n.length];
        int j = arr.length;
//        int temp; menyre tjeter
        for (int i = 0; i < arr.length; i++) {
//            temp=arr[i];
//            arr[i] = arr[j-1];
//            arr[j-1]=temp;
            arr[j-1]=n[i];
            j = j - 1;

        }

        System.out.println("Array mbrapsht ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {

        int[] array = {1,2,3,4,5,6,7,8,9,10};

        reverse_array(array);
    }
}
