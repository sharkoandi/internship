import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

public class ArraySum {

    interface SumOfArray{

        int sum(int[] array);
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};

        SumOfArray sumOfArray = (int[] x) -> {
            int sum = 0;
            for (int num : x) {
                sum += num;
            }
            return sum;
        };

        System.out.println("Shuma:"+sumOfArray.sum(arr));


    }
}
