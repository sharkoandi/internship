package Looping_Conditionals;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {

        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        if(number <= 2){
            System.err.println("Number must be >=2");
            return;
        }

        if(checkPrimeNumber(number, (int) Math.ceil(Math.sqrt(number))))
        {
            System.out.println("The number is prime");
        }
        else{
            System.out.println("The number is not prime");
        }

    }

    private static boolean checkPrimeNumber(int number, int ceil) {

        int iterator = 2;

        while(iterator <=  ceil){
            //if divided successfully return false
            if(number % iterator == 0) return false;
            iterator++;
        }

        //no successful divides, return true
        return true;
    }
}
