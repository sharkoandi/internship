public class SquareElementArray {
    public static void main(String[] args) {

        int arr[] = {10, 20, 30, 40, 50, 60};

       ElementArray square = x -> x * x;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = square.operate(arr[i]);
        }

        System.out.println("Elementet new after square :");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

