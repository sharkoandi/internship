package LambdaExpressions;

public class ReverseString {

    public static void main(String[] args) {


        String s = "Marin Bulku";

        StringInterface<String> reversed = str -> {
            StringBuilder s1 = new StringBuilder();

            for (int i = str.length()-1; i >= 0; i--) {
                s1.append(str.charAt(i));
            }

            return s1.toString();
        };

        System.out.println(reversed.perform(s));
    }
}
