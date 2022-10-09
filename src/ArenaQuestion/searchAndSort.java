package ArenaQuestion;

public class searchAndSort {
//    public static void linerSearch(int[] arr, int k){
//        for(int i=0; i< arr.length;i++){
//            if(arr[i] == k){
//                System.out.println(i);
//            }
//        }
//    }
    public static void printArray(int[] arr){
        System.out.println("Short Array Using Merge Short");
        for(int i=0; i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void merge(int[] arr, int start, int mid, int end){
        int[] merged = new int[end - start + 1];
        int low = start;
        int high = mid + 1;
        int x = 0;
        while(low <= mid && high <= end){
            if(arr[low] <= arr[high]){
                merged[x++] = arr[low++];
            }else {
                merged[x++] = arr[high++];
            }
        }
        while(low <= mid){
            merged[x++] = arr[low++];
        }
        while (high <= end){
            merged[x++] = arr[high++];
        }
        for(int i=0, j=start; i<merged.length; i++,j++){
            arr[j] = merged[i];
        }
    }
    public static void sort(int[] arr, int low, int high){
        if(low >= high){
            return;
        }
        int mid = low + (high - low) / 2;
        sort(arr, low, mid);
        sort(arr,mid+1, high);
        merge(arr, low, mid, high);
    }
    public static int binarySearch(int[] arr, int k){
        int low = 0, high = arr.length-1;
        while(low <= high){
            int mid = low + (high-low) /2;
            if(arr[mid] == k){
                return mid;
            }
            if(arr[mid] < k){
                low = mid + 1;
            }else{
                low = mid - 1;
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {7,10,15,14,5,35,9,40};
        int x = 35;
//        linerSearch(arr, x);
        sort(arr, 0, arr.length-1);
        printArray(arr);
        int result = binarySearch(arr,x);
        if(result == -1){
            System.out.println("Not Search");
        }else{
            System.out.println(x + " find in array index of after shorting " + result);
        }
    }
}
