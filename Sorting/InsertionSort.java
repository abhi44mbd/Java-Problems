import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of elements you want to store: ");
//reading the number of elements from the that we want to enter
        int n = sc.nextInt();
//creates an array in the memory of length 10
        int[] array = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0; i<n; i++)
        {
//reading array elements from the user
            array[i]=sc.nextInt();
        }
        Insertion(array);
        System.out.println(Arrays.toString(array));
    }

     static void Insertion(int[] arr) {
         for (int i = 0; i < arr.length-1 ; i++) {
             for (int j = i+1; j >0 ; j--) {
                 if(arr[j]<arr[j-1]){
                     //swaping the j with j-1
                     swap(arr,j,j-1);
                 }

             }

         }
    }
    // Swap function
    public static void swap(int[] arr, int first, int second ){
        int temp= arr[first];
        arr[first] = arr[ second];
        arr[second]=temp;
    }
}
