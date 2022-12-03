package MockTestQuestions.linkedList;
import java.util.*;
public class userInputLinkedList {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    Node head;
//    add first
    public void firstAdd(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
//    print
    public void printList(){
        if(head == null){
            System.out.println("LinkList is empty");
            return;
        }
        Node cur = head;
        while (cur != null){
            System.out.print(cur.data + " -> ");
            cur =  cur.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        userInputLinkedList list = new userInputLinkedList();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            list.firstAdd(i);
        }
        list.printList();

    }
}
