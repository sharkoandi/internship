package Exercises2;

import java.util.Scanner;

public class MultiplicationTable {

    public static void multiplicationTable(double number){

        for (int i=1;i<=10;i++){
            System.out.println(number+"*"+i+"="+i*number);
        }
    }
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Vendosni nje numer:");

        int number = s.nextInt();

        multiplicationTable(number);
    }
}
