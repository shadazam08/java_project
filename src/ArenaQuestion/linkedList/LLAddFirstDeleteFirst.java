package ArenaQuestion.linkedList;

public class LLAddFirstDeleteFirst {
    class node{
        int data;
        node next;
        node(int data){
            this.data = data;
            this.next = null;
        }
    }
    node head;
    public void addFirst(int data){
        node newNode = new node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    public void deleteFirst(){
        if(head == null){
            System.out.println("empty Node");
            return;
        }
        head = head.next;
    }
    public void deleteLast(){
        if(head == null){
            System.out.println("Node Empty");
            return;
        }
        if(head.next == null){
            head = null;
            return;
        }
        node secound = head;
        node lastNode  = head.next;
        while (lastNode.next !=null){
            lastNode = lastNode.next;
            secound = secound.next;
        }
        secound.next = null;
    }
    public void prints(){
        if(head == null){
            System.out.println("Empty Node");
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
        LLAddFirstDeleteFirst list = new LLAddFirstDeleteFirst();
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);
        list.addFirst(4);
        list.prints();
        list.addFirst(5);
        list.addFirst(6);
        list.addFirst(7);
        list.prints();

        list.deleteFirst();
        list.prints();
    }
}
