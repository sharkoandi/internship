package String_Manipulation;

import java.util.Scanner;

public class PalindromeStr {

    public static void main(String[] args) {

        System.out.println("Enter the string: ");

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        int i = 0, strLen = str.length();

        do{
            if(str.charAt(i) != str.charAt(strLen-i-1)){
                System.out.println("String is not palindrome");
                return;
            }
            i++;
        }while (i < strLen/2);

        System.out.println("String is palindrome");
    }
}
