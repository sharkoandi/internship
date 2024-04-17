import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {
        String[] stringArray = {"apple", "banana"};
        ReversString reverseString = str -> {
            StringBuilder reversed = new StringBuilder(str);
            return reversed.reverse().toString();
        };
        String[] reversedArray = reverseStrings(stringArray, reverseString);

            System.out.println(Arrays.toString(reversedArray));
        }

        public static String[] reverseStrings (String[]strings, ReversString reverse){
            String[] reversed = new String[strings.length];
            for (int i = 0; i < strings.length; i++) {
                reversed[i] = reverse.reverseName(strings[i]);
            }
            return reversed;
        }

}