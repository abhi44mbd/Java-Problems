package com.abhi;

import java.util.Scanner;

public class Fibbonachi {
    public static void main(String[] args) {
        System.out.println("Enter a number of elements in fibonachi :-");

        // take user input
        Scanner in = new Scanner(System.in);
        int end = in.nextInt();
        int t1=0, t2=1;
         int count=2;

         while(count <= end){
             System.out.println(t1);
             // calculating third term
             int t3= t1 + t2;

             // swapping variables
             t1=t2;
             t2=t3;

             // increasing counter by 1
             count ++;



         }




    }
}
