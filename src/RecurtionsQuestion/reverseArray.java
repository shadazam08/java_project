package RecurtionsQuestion;

public class reverseArray {
    public static void main(String[] args) {
        int[] array = {23,74,18,41,22,20};
        for (int i = 0; i< (array.length) / 2; i++){
           int temp = array[i];
           array[i] = array[array.length-1-i];
            array[array.length-1-i] = array[i];
            array[array.length-1-i] = temp;
        }
        for(int element:array){
            System.out.print(element + " ");
        }
    }
}
