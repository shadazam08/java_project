// find the union and intersection of the two sorted array
// array1 = {1, 3, 4, 5, 7}
// array2 = {2, 3, 5, 6}
package advanceJava;

public class unionIntersectio {
    public static void intersections(int[] array1, int[] array2){
        for(int i=0; i<array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    System.out.print(array1[i] + " ");
                }
            }
        }
    }
    public static void unions(int[] array1, int[] array2){
      int m = array1.length;
      int n = array2.length;
//      int[] result = new int[m+n];
        int i=0, j=0;
        while (i < m && j < n){
            if(array1[i] < array2[j]){
                System.out.print(array1[i++] + " ");
            } else if (array1[i]> array2[j]) {
                System.out.print(array2[j++] + " ");
            }else{
                System.out.print(array2[j]);
                i++;
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] array1 = {1, 3, 4, 5, 7};
        int[] array2 = {2, 3, 5, 6};
        unions(array1,array2);
        intersections(array1,array2);
    }
}
