package Exercise5.E2;

import java.util.LinkedHashMap;
import java.util.Map;

public class CountOccurrences {
    public static void main(String[] args) {
        String string = "DKLNGEGUERDG KDSM DNKJWN";
        for (Map.Entry<String,Integer> entry : count(string).entrySet()){
            System.out.println("Char: " + entry.getKey() + " Freq: " + entry.getValue());
        }
    }
    static Map<String,Integer> count(String word){
        Map<String,Integer> map = new LinkedHashMap<>();
        for (int i=0;i<word.length();i++){
            String str = String.valueOf(word.charAt(i));
            if (map.containsKey(str)){
                int freq = map.get(str);
                map.put(str,++freq);
            }else {
                map.put(str,1);
            }
        }
        return map;
    }
}
