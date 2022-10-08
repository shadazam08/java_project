/*
You are given an array. Find triplets(three numbers) in the array whose sum is equal to K
input: 1,2,3,4,5,6 K= 9
output: 1,2,6 1,3,5 2,3,4
* */
package ArenaQuestion;
public class findTriplets {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int k = 9;
        for(int i=0; i<arr.length-2; i++){
            for(int j=i+1; j< arr.length-1; j++){
                for(int l=j+1; l< arr.length; l++){
                    if(arr[i] + arr[j]+ arr[l] == k){
                        System.out.print(" " + arr[i] + " " + arr[j] + " "+ arr[l]);
                    }
                }
            }
        }
    }
}
//6.) Write a code to find the maximum product of adjacent numbers in an array.For Example given an array [3,2,-2,-5,7,3] the maximum product will be 21 which is product of 7 and 3.
