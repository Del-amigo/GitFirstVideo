package Day9;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task6 {

    public static void main(String[] args) {
        Scanner scan = new Scanner( System.in );
        try {
            System.out.println( "Provide your first number: " );
            double num1 = scan.nextDouble();
            System.out.println( "Provide your second number: " );
            double num2 = scan.nextDouble();
            if (num1 > num2) {
                System.out.println( "Greatest number is: " + num1 );
            } else if (num1 < num2) {
                System.out.println( "Greatest number is: " + num2 );
            } else if (num1 == num2) {
                System.out.println( "Numbers are equal" );
            }
        }catch (InputMismatchException inputMismatchException){
            System.out.println(inputMismatchException.getMessage());
            System.out.println("Provide it by number, please");
        }
    }
}