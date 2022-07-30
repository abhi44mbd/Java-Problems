public class RotatedBS {
    public static void main(String[] args) {
        int[] arr= {10,12,2,4,5,7,8,8};
        System.out.println(roatedBS(arr,0,arr.length-1,2));
    }

    private static int roatedBS(int[] arr, int start, int end, int target) {
        if(start>end)
            return -1;
        int mid= start+(end-start)/2;
        //case 1
        if(target==arr[mid]) {
            return mid;
        }

        //condition 2
        if(arr[start] <= arr[mid]){
            if (target >= arr[start] && target <= arr[mid]){
                return roatedBS(arr,start,mid-1,target);
            }
            else {
                return roatedBS(arr,mid+1,end,target);
            }
        }

//        condition 3
        if(target >= arr[mid] && target <=arr[end]){
            return roatedBS(arr,mid+1,end,target);
        }
        return roatedBS(arr,start,mid-1,target);

    }
}
