package String_Manipulation;

import java.util.HashMap;
import java.util.Scanner;

public class CharCount {

    public static void main(String[] args) {
        HashMap<Character, Integer> map = new HashMap<>();

        System.out.println("Enter the string: ");

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        char[] charArr = str.toCharArray();

        for(char c : charArr){
            if (map.containsKey(c)) {
                int count = map.get(c);
                map.put(c, count + 1);
            } else {
                map.put(c, 1);
            }
        }
        System.out.println("Each char count: ");
        for(char key : map.keySet()){
            System.out.println(key + " : " + map.get(key));
        }
    }
}
