import java.util.ArrayList;

public class LinearSearch {
    public static void main(String[] args) {
        int [] arr = {1,4,3,5,3,2,4,9,9,9};
//        ArrayList<Integer> list = new ArrayList<>();
//        System.out.println(search(arr,9,0));
//        System.out.println(searchIndex(arr,9,0));
        ArrayList<Integer> ans = searchIndexAll3(arr,4,0);

        System.out.println(ans);
    }
//    static boolean search(int [] arr ,int target, int index){
//        if (index==arr.length)
//            return false;
//        if(target == arr[index])
//            return true;
//        else
//            return search(arr,target,index+1);
//
//    }

    // finding index

//    static int searchIndex(int [] arr ,int target, int index,ArrayList<Integer> li){
//        if (index==arr.length)
//            return -1;
//        if(target == arr[index])
//            return index;
//        else
//            return searchIndex(arr,target,index+1);
//
//    }

    //returning all indices
//    static ArrayList<Integer> list = new ArrayList<>();
//    static void searchIndexAll(int [] arr ,int target, int index){
//        if (index==arr.length)
//            return;
//        if(target == arr[index])
//            list.add(index);
//        searchIndexAll(arr,target,index+1);
//
//    }
//    static ArrayList<Integer> searchIndexAll2(int[] arr ,int target, int index, ArrayList<Integer> li){
//        if (index==arr.length)
//            return li;
//        if(arr[index]==target)
//            li.add(index);
//        return searchIndexAll2(arr,target,index+1, li);
//
//    }
    // returning a internal list from function  call
    static ArrayList<Integer> searchIndexAll3(int[] arr ,int target, int index){
        ArrayList<Integer> li = new ArrayList<>();
        if (index==arr.length)
            return li;
        //this will contain ans for that particular fun() call---
        if(arr[index]==target)
            li.add(index);

        //this will return ans from below calls

        ArrayList<Integer> ansFromBelowCalls= searchIndexAll3(arr,target,index+1);
        li.addAll(ansFromBelowCalls);

        //now just return li

        return li;

    }



}
