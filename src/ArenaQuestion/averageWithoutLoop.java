package ArenaQuestion;

public class averageWithoutLoop {
    static int avgRec(int[] arr, int m, int n){
//        int n = arr.length;
        if(m == n-1){
            return arr[0];
        }
        if(m == 0){
            //            System.out.println((arr[m] + avgRec(arr, m+1)) / n);
            return ((arr[m] + avgRec(arr, m+1,n)) / arr.length);
        }
        return ((arr[m] + avgRec(arr, m+1,n) ));
    }
    public static void main(String[] args) {
        int[] arr = {10,9,7,8,5,3,2,1,11,14,6};
//        int n = arr.length;
        int n=0;
        int average = avgRec(arr, n, arr.length);
        System.out.println(average);

    }
}
