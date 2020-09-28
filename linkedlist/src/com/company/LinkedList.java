package com.company;

import java.io.*;
import  java.lang.*;

public class LinkedList{
    Node head;

    static class Node {
        public int data;
        public Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
        public static void insertAtEnd(LinkedList l,int data){

            Node new_node=new Node(data);

            if(l.head==null){
                l.head=new_node;
            }
            else{
                Node currNode=l.head;
                while(currNode.next !=null){
                    currNode=currNode.next;
                }
                currNode.next=new_node;
                //System.out.println(data+"  inserted at End");
            }
        }
        public static void insertAtBegin(LinkedList l,int data){
         Node new_node=new Node(data);

         if(l.head==null){
             l.head=new_node;
         }
         else{
             new_node.next=l.head;
             l.head=new_node;
         }
        }
        public static void deleteAtBegin(LinkedList l) {
            Node temp = l.head;
            l.head = temp.next;
            temp.next = null;
        }

        public static void printList(LinkedList l){

            Node currNode=l.head;
            while(currNode!=null){
                System.out.print(currNode.data+"->");
                currNode=currNode.next;
            }
        }


}
