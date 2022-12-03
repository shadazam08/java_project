package MockTestQuestions.linkedList;

public class LLAddFirst {
    Node head;
    class Node{
        String data;
        Node next;
        Node(String data){
            this.data = data;
            this.next = null;
        }
    }
//    Add First
    public void addFirst(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
//    print Linked List
    public void printLinkedList(){
        if(head == null){
            System.out.println("Linked List Empty");
            return;
        }
        Node currNode = head;
        while(currNode != null){
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.print("Null");
    }
    public static void main(String[] args) {
        LLAddFirst list = new LLAddFirst();
        list.addFirst("A");
        list.addFirst("B");
        list.addFirst("C");
        list.addFirst("D");
        list.addFirst("E");
        list.printLinkedList();
    }
}
