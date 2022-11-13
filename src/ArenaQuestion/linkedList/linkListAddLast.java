package ArenaQuestion.linkedList;

public class linkListAddLast {
    class Node{
        String data;
        Node next;
        Node(String data){
            this.data = data;
            this.next = null;
        }
    }
    Node head;
    public void addLast(String data){
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
    public void printList(){
        if(head == null){
            System.out.println("List is Empty");
            return;
        }
        Node currNode = head;
        while (currNode != null){
            System.out.print(currNode.data + "->");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }
    public static void main(String[] args) {
        linkListAddLast list = new linkListAddLast();
        list.addLast("A");
        list.addLast("B");
        list.addLast("C");
        list.addLast("D");
        list.addLast("E");
        list.addLast("F");
        list.addLast("G");
        list.printList();
    }
}
