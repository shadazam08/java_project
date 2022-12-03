// Given a linked List at a node at the last position.
package MockTestQuestions.linkedList;
import java.util.*;
public class LLLastPosition {
    class node{
        int data;
        node next;
        node(int data){
            this.data = data;
            this.next = null;
        }
    }
    node head;
    public void lastPosition(int data){
        node newNode = new node(data);
        if(head == null){
            head = newNode;
            return;
        }
        node currNode = head;
        while (currNode.next != null){
            currNode = currNode.next;
        }
        currNode.next = newNode;
//        head = newNode;
    }
    public void printNthFromLast(int N) {
        int len = 0;
        node temp = head;
        while (temp != null) {
            temp = temp.next;
            len++;
        }
        if (len < N) {
            return;
        }
        temp = head;
        for (int i = 1; i < len - N + 1; i++) {
            temp = temp.next;
        }
        System.out.println(temp.data);
    }
    public void printLinked(){
        if(head == null){
            System.out.println("Empty list");
            return;
        }
        node currNode = head;
        while (currNode != null){
            System.out.print(currNode.data + "->");
            currNode = currNode.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        LLLastPosition list = new LLLastPosition();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            int l = sc.nextInt();
            list.lastPosition(l);
        }
        list.printLinked();

        int x = sc.nextInt();
        list.printNthFromLast(x);
    }
}
