package com.company;

import java.util.LinkedList;
import java.util.Queue;

class Node{
    int key;
    Node left,right;
    public Node(int item){
        key=item;
        left=right=null;
    }
}
public class BinaryTree{
    Node root;
    BinaryTree(){
        root=null;
    }
    public void PreOrder(Node node){
        if(node!=null){
            System.out.println(node.key);
            PreOrder(node.left);
            PreOrder(node.right);
        }
    }
    public void InOrder(Node node){
        if(node!=null){
            InOrder(node.left);
            System.out.print(node.key+" ");
            InOrder(node.right);
        }
    }
    public void PostOrder(Node node){
        if(node!=null){
            PostOrder(node.left);
            PostOrder(node.right);
            System.out.print(node.key+" ");
        }
    }
    public void LevelOrder(Node node){
        Queue<Node> q=new LinkedList<Node>();
        q.add(node);
        int count=0,count1=0,count2=0;
        int max=node.key;
        while(!q.isEmpty()) {
            count2++;
            Node temp = q.poll();
            if(max<temp.key){
                max=temp.key;
            }
            System.out.println(temp.key + " ");

            if (temp.left != null) {
                q.add(temp.left);
            }

            if (temp.right != null) {
                q.add(temp.right);
            }
            if(temp.left==null || temp.right==null){
                count++;
            }
            if(temp.left!=null || temp.right!=null){
                count1++;
            }

        }
        System.out.println("Maximum element "+max);
        System.out.println("No. of leaf "+count);
        System.out.println("full nodes "+count1);
        System.out.println("No of nodes "+count2);

    }
    public void inverting(Node root){
        Node temp;
        if(root!=null){
            inverting(root.left);
            inverting(root.right);
            temp=root.left;
            root.left=root.right;
            root.right=temp;
        }
    }
    public static void main(String[] args){
      BinaryTree tree=new BinaryTree();
      tree.root=new Node(1);
      tree.root.left=new Node(2);
      tree.root.right=new Node(3);
      tree.root.left.left=new Node(4);
      tree.root.left.right=new Node(5);
      tree.root.right.left=new Node(6);
      tree.root.right.right=new Node(7);
      //tree.PreOrder(tree.root);
      //tree.InOrder(tree.root);
        // tree.PostOrder(tree.root);
        // tree.inverting(tree.root);
        tree.LevelOrder(tree.root);
    }
}
