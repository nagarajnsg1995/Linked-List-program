package com.bridgrlabz;


public class LinkedListLogic {
    Node head;


    public void insertNode(int data) {
        Node myNode = new Node(data);
        myNode.setData(data);
        myNode.setNext(head);
        head = myNode;
    }

    public void toPrint() {
        Node presentNode = head;
        System.out.println("LinkedList is :");
        while (presentNode != null) {
            presentNode.toPrint();
            presentNode = presentNode.next;
        }
    }
}

