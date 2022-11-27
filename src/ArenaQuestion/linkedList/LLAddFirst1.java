package ArenaQuestion.linkedList;

public class LLAddFirst1 {
    class node{
        int data;
        node next;
        node(int data){
            this.data = data;
            this.next = null;
        }
    }
    node head;
    public void addFirsts(int data){
        node newNode = new node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    public void printNode(){
        if(head == null){
            System.out.println("Node is empty");
            return;
        }
        node currNode = head;
        while (currNode != null){
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.print("null");
    }

    public static void main(String[] args) {
        LLAddFirst1 list = new LLAddFirst1();
        list.addFirsts(1);
        list.addFirsts(2);
        list.addFirsts(3);
        list.addFirsts(4);
        list.addFirsts(5);
        list.printNode();
    }
}
