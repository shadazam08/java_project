package advanceJava;

public class nationalFlageArray {
    public static void printArray(int[] array){
//        for(int i = 0; i< array.length;i++){
//            System.out.print(array[i] + " ");
//        }
        for(int el:array){
            System.out.print(el + " ");
        }
    }
    public static void sortArray(int[] array){
        int n= array.length;
        for(int i=0;i<n-1; i++){
           for(int j=0; j<n-i-1; j++){
               if(array[j] > array[j+1]){
                   int temp = array[j];
                   array[j] = array[j+1];
                   array[j+1] = temp;
               }
           }
        }
    }

    public static void main(String[] args) {
        int[] array = {0, 1 ,1 ,0 ,1 ,2 ,1 ,2 ,0, 0, 0, 1};
        sortArray(array);
        printArray(array);
    }
}
