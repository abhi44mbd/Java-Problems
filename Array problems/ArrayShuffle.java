package com.abhi;

import java.util.Arrays;

public class ArrayShuffle {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        System.out.println(Arrays.toString(shuffle(arr,3)));

    }
    static int[] shuffle(int[] arr,int n){

            int[] res = new  int [2*n];
            int j=n;
            int i=0;
            int k=0;
            while(i<n){
                res[k++]=arr[i];
                res[k++]=arr[i+j];
                i++;
            }
            return res;
        }



}
