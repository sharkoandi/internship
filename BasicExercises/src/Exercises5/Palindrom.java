package Exercises5;
import java.util.Scanner;

public class Palindrom {

    public static boolean EshtePalindrom(String s){

        s=s.replaceAll(" ","");
        s=s.toLowerCase();

        if (s.length()==0 || s.length()==1) return true;

        if (s.charAt(0)==s.charAt(s.length()-1)) return EshtePalindrom(s.substring(1,s.length()-1));

        return false;
    }
    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);
        System.out.println("Jepni nje string:");
        String str=s.nextLine();
        System.out.println(EshtePalindrom(str));

    }
}
