package com.abhi;

import java.util.Arrays;

public class SumOfArray {
    public static void main(String[] args) {
        int [] arr={2,6,8};
        int sum= Arrays.stream(arr, 1, 3).sum();
        System.out.println(sum);
    }
}
