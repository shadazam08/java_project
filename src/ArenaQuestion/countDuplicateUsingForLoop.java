package ArenaQuestion;
//import java.util.Scanner;
public class countDuplicateUsingForLoop {
    static void countDuplicates(int[] arr){
        int[] temp = new int[arr.length];
        for(int i = 0; i < arr.length; i++){
            temp[i] =0;
        }
        for(int i=0; i< arr.length; i++) {
                temp[arr[i]]++;
        }
        for(int i=0; i<arr.length; i++){
            if(temp[i] >= 1){
                System.out.println(i + " " + temp[i]);
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 1, 4,4, 2, 3};
       /* int count=0;
        for(int i = 0; i<arr.length; i++){
            count = count ^ arr[i];
        }
        System.out.println(count);*/
        countDuplicates(arr);
    }
}
