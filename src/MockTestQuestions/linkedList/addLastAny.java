package MockTestQuestions.linkedList;

import java.util.Scanner;

public class addLastAny {
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
    public void deletePosition(){
        Scanner sc = new Scanner(System.in);
        if(head == null){
            System.out.print("empty Node");
            return;
        }
        int pos = sc.nextInt();
        node first = head;
        node seco = head.next;
        for(int i=1; i<pos-1; i++){
            first = first.next;
            seco = seco.next;
        }
        first.next = seco.next;
    }
    public void addPosition(int data){
        Scanner sc = new Scanner(System.in);
        node newNode = new node(data);
        if(head == null){
            return;
        }
        node fir = head;
        node sec = head.next;
        System.out.print("Enter position: ");
        int pos = sc.nextInt();
        for(int i=1; i<pos-1; i++){
            sec = sec.next;
            fir = fir.next;
        }
        fir.next = newNode;
        newNode.next = sec;
    }
    public static void main(String[] args) {
        addLastAny list = new addLastAny();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            int m = sc.nextInt();
            list.addLast(m);
        }
        list.prints();
        System.out.print("Enter Element: ");
        int a = sc.nextInt();
        list.addPosition(a);
        list.prints();
        list.deletePosition();
        list.prints();
    }
}
