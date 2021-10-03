package com.abhi;

import java.util.Scanner;

public class TakingUserInput {
    public static void main(String args[]){
        //to take user input use Scanner class

        Scanner input= new Scanner(System.in);
        String name = input.nextLine();

        // printing users input

        System.out.println("Hello " + name);


    }
}
