package MockTestQuestions.linkedList;
public class linkListAddLast {
    Node head;
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
//    Add Last
    public void addLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node currNode = head;
        while (currNode.next != null){
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }
//    print List
    public void printList(){
        if(head == null){
            System.out.println("Empty List");
            return;
        }
        Node currNode = head;
        while (currNode != null){
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("Null");
    }
    public static void main(String[] args) {
        linkListAddLast list = new linkListAddLast();
        list.addLast(4);
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(5);
        list.printList();
    }
}
