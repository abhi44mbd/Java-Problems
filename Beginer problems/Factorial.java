package com.abhi;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        System.out.println("Enter a number to find factorial :-");

        // take user input

        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        // intialize fact var with 1

        int fact = 1;

        // initialize while loop var
        
        int i=1;

        // a while loop to calculate factorial
        while(i<= num){


            fact= fact *i;
            i++;
        }

        System.out.println(fact);


    }
}
