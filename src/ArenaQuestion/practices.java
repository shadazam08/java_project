/*
    1.  Given an array and a number find if sum of any two elements of array is equal to that number or not

    2.  Given an array find the difference between max and min element of an array

    3.  Given an array find the average of array without using for loop

*/
package ArenaQuestion;
import java.util.*;
public class practices {
    public static void main(String[] args) {
        int[] arr = {7,5,12,2,4,11,8};
        int k = 15;
        for(int i=0; i<arr.length-2; i++){
            for(int j=i+1; j< arr.length-1; j++){
                    if(arr[i] + arr[j] == k){
                        System.out.print(" " + arr[i] + " " + arr[j]);
                    }
            }
        }
    }
}
