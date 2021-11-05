package com.abhi;

public class InfiniteArray {
    public static void main(String args[]){
        int[] arr={1,5,8,9,17,18,19,25,27,28,29,30,35,38,39,40,47,50};
        int target=29;
        System.out.println(ans(arr,target));

    }
    static int ans(int[] arr, int target){
        int start =0;
        int end=1;

        while(target>arr[end]){
            int temp= end+1;

            //doubling block size
            end=end + (start-end +1 )*2;
            start=temp;
        }
        return Binarysearch(arr,target,start,end);

    }
    static int Binarysearch(int[] arr, int target, int start ,int end){

        while(start<=end){
            int mid= start+ (end-start)/2;
            if (target>arr[mid]){
                start= mid+1;
            } else if (target<arr[mid]) {
                end=mid-1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
