package ArenaQuestion;

public class differenceMinMax {
    public static void main(String[] args) {
        int[] array_numbs = {10,9,7,8,5,3,2,1,11,14,6};
        int min = array_numbs[0];
        int max = array_numbs[0];
        for(int i=1; i< array_numbs.length; i++){
            if(array_numbs[i] > max){
                max = array_numbs[i];
            } else if (array_numbs[i] < min) {
                min = array_numbs[i];
            }
        }
        System.out.println(max - min);
    }
}
