package com.abhi;

import java.util.Arrays;

public class ArraySwap {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
       reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] arr,int index,int index2){
        int temp;
        temp=arr[index];
        arr[index]=arr[index2];
        arr[index2]= temp;


    }
    static void reverse(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            swap(arr, start,end);
            start++;
            end--;
        }
    }
}
