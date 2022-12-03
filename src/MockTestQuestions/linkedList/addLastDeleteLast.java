package MockTestQuestions.linkedList;

public class addLastDeleteLast {
    class node{
        int data;
        node next;
        node(int data){
            this.data = data;
            this.next = null;
        }
    }
    node head;
    public void addLast(int data){
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
    public void deleteLast(){
        if(head == null){
            System.out.println("empty Node");
            return;
        }
        if(head.next == null){
            head = null;
            return;
        }
        node firstNode = head.next;
        node secoNode = head;
        while (firstNode.next != null){
            secoNode = secoNode.next;
            firstNode = firstNode.next;
        }
        secoNode.next = null;
    }
    public void prints(){
        if(head == null){
            System.out.println("Empty Node");
            return;
        }
        node cuuNode = head;
        while (cuuNode != null){
            System.out.print(cuuNode.data + " -> ");
            cuuNode = cuuNode.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        addLastDeleteLast list = new addLastDeleteLast();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.addLast(5);
        list.prints();
        list.deleteLast();
        list.prints();
    }
}
