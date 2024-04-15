package Exercises2;

import java.util.Scanner;

public class PrimeNumber {

    public static boolean isPrime(int number){

        if (number<=1) return false;
        else {

            for (int i = 2;i<=Math.sqrt(number);i++){

                if (number%2==0) return false;
            }

        }

        return true;

    }

    public static void main(String[] args) {

        System.out.println("Vendosni nje numer");

        Scanner s = new Scanner(System.in);

        int number = s.nextInt();

        if(isPrime(number)) System.out.println("Numri "+number+" eshte prime");
        else System.out.println("Numri "+number+" nuk eshte prime");

    }
}
