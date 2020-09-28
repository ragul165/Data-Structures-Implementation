package com.company;

public class Main {
    public static void main(String[] args){
        LinkedList l =new LinkedList();
        l.insertAtEnd(l,1);
        l.insertAtEnd(l,2);
        l.insertAtEnd(l,3);
        l.insertAtBegin(l,4);
        l.deleteAtBegin(l);
        l.insertAtBegin(l,5);

        LinkedList.printList(l);
    }
}
