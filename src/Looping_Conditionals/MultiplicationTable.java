package Looping_Conditionals;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        System.out.println("Enter the number: ");

        Scanner sc = new Scanner(System.in);

        double number = sc.nextDouble();

        showMultiplicationTable(number);
    }

    private static void showMultiplicationTable(double number) {

        for(int i =1; i<=10; i++){
            double product = number*i;
            String output = i + ". " + number + " x " + i + " = " + product;
            System.out.println(output);
        }
    }
}
