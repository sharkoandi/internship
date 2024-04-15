package Exercise2.E1;

public class NumberCheck {
    public static void main(String[] args) {
        System.out.println(isPrime(5));
    }

    static boolean isPrime(int num){
        if (num <= 1){
            return false;
        }
        for (int i = 2; i < Math.sqrt(num) ; i++){
            if (num % 2 == 0){
                return false;
            }
        }
        return true;
    }
}
