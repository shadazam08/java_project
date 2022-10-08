package SortingS;

public class mergeSort1 {
    public static void printArray(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void merge(int[] arr, int start, int mid, int end){
        int[] merged = new int[end - start + 1];
        int index1 = start;
        int index2 = mid+1;
        int x = 0;
        while(index1 <= mid && index2 <= end){
            if(arr[index1] <= arr[index2]){
                merged[x++] = arr[index1++];
            }else{
                merged[x++] = arr[index2++];
            }
        }
        while (index1 <= mid){
            merged[x++] = arr[index1++];
        }
        while (index2 <= end){
            merged[x++] = arr[index2++];
        }
        for(int i=0, j=start; i<merged.length; i++,j++){
            arr[j] = merged[i];
        }
    }
    public static void sort(int[] arr, int low, int high){
        if(low >= high){
            return;
        }
        int mid = low + (high - low) /2;
        sort(arr, low, mid);
        sort(arr, mid+1, high);
        merge(arr, low, mid, high);
    }
    public static void main(String[] args) {
        int arr[] = {7,8,2,3,1};
        int n = arr.length;
        sort(arr, 0, n-1);
        printArray(arr);
    }
}
