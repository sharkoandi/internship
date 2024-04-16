package LambdaExpressions;

import java.util.ArrayList;
import java.util.List;

public class ReverseString {

    static List<String> reverse(GetArrayReturnList<String> func,String[] strings){
        return func.apply(strings);
    }

    public static void main(String[] args) {
        GetArrayReturnList<String> reverseString =
                (String[] str)-> {
                    List<String> strings = new ArrayList<>();
                    for (String s : str) {
                        StringBuilder sb = new StringBuilder();
                        int l = str.length;
                        for (int i=s.length()-1;i>-1;i--){
                            sb.append(s.charAt(i));
                        }
                        strings.add(sb.toString());
                    }
                    return strings;
                };


        String[] strings = new String[]{"Algorhythm","Tirana"};
        List<String> reversedStrings = reverse(reverseString,strings);

        for (String s : reversedStrings){
            System.out.println(s);
        }
    }
}
