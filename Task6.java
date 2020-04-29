package Day9;

import java.util.Scanner;

public class Task6 {
    // Take two numbers from the user and print the greatest number
    // input:
//    first number: 10
//    second number : 50
//    output
//    greatest number is: 50
    public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
        System.out.println("Provide your first number: ");
        double num1 = scan.nextDouble();
        System.out.println("Provide your second number: ");
        double num2 = scan.nextDouble();
        if (num1>num2) {
            System.out.println("Greatest number is: " + num1);
        }else if (num1<num2){
            System.out.println("Greatest number is: " + num2);
        }else if (num1==num2){
            System.out.println("The numbers are equal");
        }

    }
}
