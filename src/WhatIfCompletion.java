import java.util.Scanner;

public class WhatIfCompletion {
    public static void main(String[]args){
        Scanner keybd = new Scanner(System.in);
        int num1, num2, sum, product, average;

        System.out.print("Please enter your first number: ");
        num1 = keybd.nextInt();

        System.out.print("Please enter your second number: ");
        num2 = keybd.nextInt();
        average = (num1 + num2)/2;
        sum = num1 +num2;
        product = num1*num2;

        System.out.printf("The sum: %d\nThe product: %d\nThe average: %d", sum, product, average);
    }
}
