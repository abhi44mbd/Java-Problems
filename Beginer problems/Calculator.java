package com.abhi;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println(" Enter Any two numbers:-");
        Scanner input= new Scanner(System.in);

        // take first number
        float num1 = input.nextInt();
        // take second number
        float num2= input.nextInt();

        // take operator input
        System.out.println("Enter the operator (+ ,- ,* ,/ ,% ) :-");
        char ope= input.next().charAt(0);

        // intialize result variable
        float result =0 ;


        // switch case to do operation
        switch (ope) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case'/':
                result= num1 /num2;
                break;
            case '%':
                result= num1 % num2;
                break;
            default:
                System.out.println("Please enter a valid operator.");
                        }

        System.out.println(result);

    }
}
