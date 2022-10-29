package ArenaQuestion;

public class countUniqueNumber {
    public static void main(String[] args) {
        int[] A = {1, 1, 2, 2, 3, 5};
        for(int i=0; i<A.length; i++){
            int count=0;
            for(int j=0; j<A.length;j++){
                if(A[j] == A[i]){
                    count++;
                }
            }
            if(count == 1){
                System.out.print(A[i] + " ");
            }
            System.out.println();
        }
    }
}
