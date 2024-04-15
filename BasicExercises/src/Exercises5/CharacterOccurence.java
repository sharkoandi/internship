package Exercises5;

import java.util.HashMap;
import java.util.Map;

public class CharacterOccurence {

    public static void characterCount(String inputString) {
        HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();

        char[] strArray = inputString.toCharArray();

        for (char c : strArray) {
            if (charCountMap.containsKey(c)) charCountMap.put(c, charCountMap.get(c) + 1);

            else charCountMap.put(c, 1);

        }

        for (Map.Entry entry : charCountMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

    // Driver Code
    public static void main(String[] args)
    {
        String str = "Algorhythm internship";
        characterCount(str);
    }
}
