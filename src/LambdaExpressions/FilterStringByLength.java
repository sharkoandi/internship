package LambdaExpressions;

import java.util.Arrays;

public class FilterStringByLength {

    public static void main(String[] args) {

        String[] arr = {"TestString1", "Test", "Test2", "OptionalStr", "Str"};

        StringsInterface<String> filter = array -> {

            int count = 0;
            String[] filtered = new String[array.length];

            for (String s:
                 array) {

                if(s.length() > 5)
                    filtered[count++] = s;
            }
            return filtered;
        };

        System.out.println(Arrays.toString(filter.perform(arr)));

    }
}
