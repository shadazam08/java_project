/*
Start from the leftmost element of arr[] and one by one compare x with each element of arr[]
If x matches with an element, return the index.
If x doesn’t match with any of the elements, return -1.
* */
package Searching;

public class linerSearch {
    static int search(int[] arr, int x){
        int n = arr.length;
        for(int i = 0; i<n; i++){
            if(arr[i] == x){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = { 2, 3, 4, 40, 10 };
        int x = 10;
        int result = search(arr, x);
        if(result == -1){
            System.out.println("Element Does Not Match of arr[]");
        }else{
            System.out.println("Elemet Match of arr[i]:   " + result);
        }
    }
}
