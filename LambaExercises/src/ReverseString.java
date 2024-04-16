import java.util.Arrays;
import java.util.List;

public class ReverseString {

    interface Reverse{

        List<String> reversedString(String[] arr);
    }
    public static void main(String[] args) {

        String arr[] = {"Milo","Jani","Nano","Daniel","Tyc"};

        Reverse reverse = (String[] x) -> {

            return Arrays.stream(x).map(i -> new StringBuilder(i).reverse().toString()).toList();

        };

        System.out.println("Stringjet mbrapsht:"+reverse.reversedString(arr));


    }
}
