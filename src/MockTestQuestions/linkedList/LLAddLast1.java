package MockTestQuestions.linkedList;

public class LLAddLast1 {
    class node{
        int data;
        node next;
        node(int data){
            this.data = data;
            this.next = null;
        }
    }
    node head;
    public void addLasts(int data){
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
    }
    public void prinNodes(){
        if(head == null){
            System.out.println("Node is Empty");
            return;
        }
        node currNode = head;
        while (currNode != null){
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        LLAddLast1 list = new LLAddLast1();
        list.addLasts(1);
        list.addLasts(2);
        list.addLasts(3);
        list.addLasts(4);
        list.addLasts(5);
        list.prinNodes();
    }
}
