package ArenaQuestion.Strings;
import java.util.Scanner;
public class reverseStrings2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Original String Words : ");
        String orgString = sc.nextLine();
        String[] nWords = orgString.split("\\s");
        String newString = "";
        for (int i=0; i< nWords.length; i++){
            if (i == nWords.length-1){
                newString = nWords[i] + newString;
            }else {
                newString = " " + nWords[i] + newString;
            }
        }
        System.out.print("Your reverse string is : " + newString);
    }
}
