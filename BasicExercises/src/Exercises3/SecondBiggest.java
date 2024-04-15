package Exercises3;

public class SecondBiggest {

    public static void secondLargest(int arr[]){

        int temp;
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = i + 1; j < arr.length; j++)
            {
                if (arr[i] > arr[j])
                {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Numri i dyte me i madh eshte:"+arr[arr.length-2]);
    }

    public static void main(String[] args) {

        int[] array = {1,2,3,4,5,6,7,8,9,10};

        secondLargest(array);


    }
}
