// move all negative element to one side of the array
// 1,-1,3,2,-7,-5,11
package advanceJava;

public class moveNegativeArray {
    public static void printArray(int[] array){
        for(int el:array){
            System.out.print(el + " ");
        }
    }
    public static void sortArray(int[] array){
        int j=0, temp;
        for(int i = 0; i<array.length-1; i++){
            if(array[i] < 0){
                if(i != j){
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
                j++;
            }
        }
    }
    public static void main(String[] args) {
        int[] array = {1,-1,3,2,-7,-5,11};
        sortArray(array);
        printArray(array);
    }
}
