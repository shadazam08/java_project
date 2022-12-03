package MockTestQuestions.linkedList;

public class addFirstDeleteFirst {
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
    public void prints(){
        if(head == null){
            System.out.println("Empty Node");
            return;
        }
        node currNode = head;
        while (currNode != null){
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("null");
    }
    public void deleteFirst(){
        if(head == null){
            System.out.println("empty Node");
            return;
        }
        head = head.next;
    }

    public static void main(String[] args) {
        addFirstDeleteFirst list = new addFirstDeleteFirst();
        list.addFirst(1);
        list.addFirst(3);
        list.addFirst(4);
        list.addFirst(5);
        list.prints();
        list.deleteFirst();
        list.prints();
    }
}
