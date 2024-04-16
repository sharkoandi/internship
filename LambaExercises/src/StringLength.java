import java.util.Arrays;
import java.util.List;

public class StringLength {

    interface FilterByLength{

        List<String> filterStrings(String[] arr,int l);
    }
    public static void main(String[] args) {

        String arr[] = {"Milo","Jani","Nano","Daniel","Tyc"};

        int wordLength=3;

        FilterByLength filterByLength = (String[] x,int l) -> {
            return Arrays.stream(x).filter(s -> s.length()>l).toList();
        };

        System.out.println("Stringjet:"+filterByLength.filterStrings(arr,wordLength));

    }
}
