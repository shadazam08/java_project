package MockTestQuestions.linkedList;

public class linkListAddFirst {
    Node head;
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
//    Add list first position;
    public void firstAdd(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    public void printList(){
        if(head == null){
            System.out.println("Empty list");
            return;
        }
        Node curNode = head;
        while (curNode != null){
            System.out.print(curNode.data + " -> ");
            curNode = curNode.next;
        }
        System.out.println("NULL");
    }
    public static void main(String[] args) {
        linkListAddFirst list = new linkListAddFirst();
        list.firstAdd(1);
        list.firstAdd(2);
        list.firstAdd(3);
        list.firstAdd(4);
        list.firstAdd(5);
        list.printList();

    }
}
