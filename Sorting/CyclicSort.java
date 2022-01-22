import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args){
        int[] arr={4,3,5,2,1};
        sort(arr);
        System.out.println(Arrays.toString(arr));

    }

     static void sort(int[] arr) {
        int i=0;
        while(i < arr.length){
            //determining the correct position of element by its value
            //because the array is contiguous from 1- N
            // the position of an element will be 'value-1'
            //if the element is 3 then its position will be 3-1 that is at index 2.
            int correct= arr[i]-1;

            //  if condition makes sure that is the element already at its correct position
            //if not then the swapping is performed with the correct position of element
            if(arr[i] != arr[correct]){
                swap(arr, i , correct);
            }
            else
                i++;
        }

    }
    // swap function
     static void swap(int[] arr, int first, int second) {
        int temp= arr[first];
        arr[first]=arr[second];
        arr[second]= temp;


    }

}
