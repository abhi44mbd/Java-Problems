package com.abhi;
import java.util.Arrays;

public class ArrayDoubling {
    public static void main(String[] args) {
        int[] arr={1,2,3};
        int[] result= new int[arr.length*2];
        System.arraycopy(arr,0,result,0,arr.length);
        System.arraycopy(arr,0,result,arr.length,arr.length);
        int a= Integer.MIN_VALUE;
        System.out.println(Arrays.toString(result));
    }


}
