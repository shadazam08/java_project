package MockTestQuestions.linkedList;

import java.util.Scanner;

public class addDeleteAny {
    class node{
        int data;
        node next;
        node(int x){
            this.data = x;
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
    public void deleteNode(){
        Scanner sc = new Scanner(System.in);
        if(head == null){
            System.out.println("list is empty");
            return;
        }
        int pos = sc.nextInt();
        node firt = head;
        node secou = head.next;
        for(int i=1;i<pos-1; i++){
            firt = firt.next;
            secou = secou.next;
        }
        firt.next = secou.next;
    }
    public void prints(){
        if(head == null){
            System.out.println("empty node");
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
        addDeleteAny list = new addDeleteAny();
        Scanner sc = new Scanner(System.in);
        System.out.print("How Many Add in List: ");
        int n = sc.nextInt();
        System.out.print("insert list: ");
        for(int i=0; i<n; i++){
            int l = sc.nextInt();
            list.addFirst(l);
        }
        list.deleteNode();
        list.prints();
    }
}
