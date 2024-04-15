package Exercise5.E1;

public class PalindromeCheck {
    public static void main(String[] args) {
        System.out.println(isPalindrome("algorhythm"));
    }

    static boolean isPalindrome(String string){
        String str = string.toLowerCase();
        int lastCharIndex = str.length()-1;
        int length = str.length();
        for(int i=0;i<length/2;i++){
            if (str.charAt(i) != str.charAt(lastCharIndex-i)){
                return false;
            }
        }
        return true;
    }
}
