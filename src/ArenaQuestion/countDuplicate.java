/*
Count duplicates
Problem Statement
Given an array of N elements, your task is to find the count of repeated elements. Print the repeated elements in ascending order along with their frequency.
Have a look at the example for more understanding.
Example
Sample Input:-
5
3 2 1 1 2
Sample Output:-
1 2
2 2
Explanation:
test 1: Only 1 and 2 are repeated. Both are repeated twice. So, we print:
1 -> frequency of 1
2 -> frequency of 2
1 is printed before 2 as it is smaller than 2
* */
package ArenaQuestion;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class countDuplicate {
    static HashMap<Integer, Integer> fDuplicate(int []arr, int size){
        HashMap<Integer, Integer> dup = new HashMap<>();
        for(int i=0; i<size; i++){
            if(dup.containsKey(arr[i])){
                dup.put(arr[i], dup.get(arr[i]) + 1);
            }else{
                dup.put(arr[i],1);
            }
        }
        return dup;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        HashMap<Integer, Integer> dup = fDuplicate(arr, n);
//        using forEach
        for(Map.Entry<Integer, Integer> entry : dup.entrySet()){
//            if(entry.getValue() > 1){
                System.out.println(entry.getKey() + " " + entry.getValue());
//            }
        }
    }
}
