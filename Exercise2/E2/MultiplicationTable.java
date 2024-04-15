package Exercise2.E2;

public class MultiplicationTable {
    public static void main(String[] args) {
        printMultiplicationTable(15);
    }
    static void printMultiplicationTable(int number){
        for (int i = 1;i<= 10;i++){
            System.out.println(number + " * " + i + " = " + (number*i));
        }
    }
}
