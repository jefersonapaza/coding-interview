package datastructures.linkedlist;

import java.util.ArrayList;
import java.util.List;

public class Node {
    Node next = null;
    int data;

    public Node(int d){
        this.data = d;
    }

    public void appendToTail(int d){
        Node end = new Node(d);
        Node n = this;
        while(n.next != null){
            n = n.next;
        }
        n.next = end;
    }

    public Node deleteNode(Node head, int d){
        Node n = head;
        if(n.data == d){
            return head.next;
        }
        while( n.next != null){
            if(n.next.data == d){
                n.next = n.next.next;
                return head;
            }
            n = n.next;
        }
        return head;
    }

    public void printLinkedList() {
        Node n = this;
        while(n.next != null){
            System.out.print(n.data + " -> ");
            n = n.next;
        }
        System.out.print(n.data);
    }

    /*
    Remove Dups! Write code to remove duplicates from an unsorted linked list.
    FOLLOW UP
    How would you solve this problem if a temporary buffer is not allowed?
    */
    void removeDups(){
        List<Integer> buffer = new ArrayList<>();
        Node n = this;
        Node prev = this;
        while(n.next != null){
            int data = n.data;
            if(buffer.contains(data)){
                prev.next = n.next;
            }else{
                buffer.add(data);
                prev = n;
            }
            n = n.next;
        }
    }
    void removeDups2(){
        Node n = this;
        while(n.next != null){
            int data = n.data;
            Node i = this.next;
            Node prev = this;
            while(i.next != null){
                if(i.data == data && i != n){
                    prev.next = i.next;
                }
                prev = i;
                i = i.next;
            }

            n = n.next;
        }
    }


}
