package ArenaQuestion;

public class averageWithForLoop {
    public static void main(String[] args) {
        int[] arr = {10,9,7,8,5,3,2,1,11,14,6};
        double sum =0;
        for(int i=0; i<=arr.length-1; i++){
            sum += arr[i];
        }
        double average = sum / arr.length;
        System.out.println(average);
    }
}
