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
        //head.removeDups2();
        //head.printLinkedList();

        Node list1 = new Node(7);
        list1.appendToTail(1);
        list1.appendToTail(6);

        Node list2 = new Node(5);
        list2.appendToTail(9);
        list2.appendToTail(2);

        Node result = list1.sumLists(list2);
        result.printLinkedList();

    }
}
