package LambdaExpressions.FilterStringsByLength;

import LambdaExpressions.Filter;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        Filter<String> myStringFilter =
                (String[] arryOfStrings)->{
                List<String> strings = new ArrayList<>();
                    for (String str : arryOfStrings){
                        if (str.length() > 5){
                            strings.add(str);
                        }
                    }
                    return strings;
                };

        String[] strings = new String[]{"Str","String","stri","Strrrrrrr"};

        List<String> satisfyCondition = myStringFilter.func(strings);
        for (String str : satisfyCondition){
            System.out.println(str);
        }
    }
}
