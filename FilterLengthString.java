import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterLengthString {
    public static void main(String[] args) {
        String[] str = {"apple", "orange", "kiwi"};


        List<String> filteredStrings = filterStrings(str, s -> s.length() > 5);

        System.out.println("Filtered strings: " + filteredStrings);
    }

    public static List<String> filterStrings(String[] strings, StringFilter filter) {
        return Arrays.stream(strings)
                .filter(filter::check)
                .collect(Collectors.toList());
    }
}
