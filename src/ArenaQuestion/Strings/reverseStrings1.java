package ArenaQuestion.Strings;
import java.util.Scanner;
public class reverseStrings1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Original String is -> ");
        String string1 = sc.nextLine();
        String[] words = string1.split("\\.");
        String newString = "";
        for (int i=0; i< words.length; i++){
            if (i == words.length-1){
                newString = words[i] + newString;
            }else {
                newString = "." + words[i] + newString;
            }
        }
        System.out.print("Reverse String is -> " + newString);
    }
}
