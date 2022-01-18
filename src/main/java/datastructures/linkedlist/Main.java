package datastructures.linkedlist;

public class Main {

    public static void main(String [] args) {
        Node head = new Node(5);
        head.appendToTail(5);
        head.appendToTail(6);
        head.appendToTail(11);
        head.appendToTail(15);
        head.appendToTail(18);

        head.appendToTail(6);
        head.appendToTail(11);
        head.appendToTail(19);
       // head.removeDups();
        head.removeDups2();
        head.printLinkedList();
    }
}
