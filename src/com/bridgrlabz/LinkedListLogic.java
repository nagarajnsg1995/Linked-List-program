package com.bridgrlabz;


public class LinkedListLogic {
    Node head;

    public void insertFirst(int data) {
        Node myNode = new Node(data);
        myNode.setData(data);
        myNode.setNext(head);
        head = myNode;
    }

    public void insertLast(int data) {
        Node presentNode = head;
        while (presentNode.next != null) {
            presentNode = presentNode.next;
        }
        Node node = new Node(data);
        node.setData(data);
        presentNode.setNext(node);
    }

    public void toPrint() {
        Node presentNode = head;
        System.out.println("LinkedList is: ");
        while (presentNode != null) {
            presentNode.toPrint();
            presentNode = presentNode.next;
        }
    }

    public void insertBetween(int before, int after, int data) {
        Node presentNode = head;
        while (presentNode.data != before && presentNode.data != after) {
            presentNode = presentNode.next;
        }
        Node node = new Node(data);
        node.next = presentNode.next;
        presentNode.next = node;
    }

    public void searcNode(int data) {
        Node presentNode = head;
        while (presentNode != null) {
            if (presentNode.data == data) {
                System.out.println("Number " +data+ " found in the list:");
            }
            presentNode = presentNode.next;
        }
    }

    public void insertNumber(int before, int data) {
        Node presentNode = head;
        while (presentNode.data != before) {
            presentNode = presentNode.next;
        }
        Node node = new Node(data);
        node.next = presentNode.next;
        presentNode.next = node;
    }

    public void deleteAnyNumber(int data) {
        Node presentNode = head, previousNode = head;
        while (presentNode != null) {
            if (presentNode.data == data) {
                previousNode.next = presentNode.next;
            }
            previousNode = presentNode;
            presentNode = presentNode.next;

        }
        System.out.println("removed:" +data);
    }
}