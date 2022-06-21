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
    public void firstDelete() {
        head = head.next;
    }

    public void lastDelete() {
        Node presentNode = head, secondLast = null;
        while (presentNode.next != null) {
            secondLast = presentNode;
            presentNode = presentNode.next;
        }
        if (secondLast != null) {
            secondLast.next = null;
        }
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
    public void ascendingOrder() {
        Node presentNode = head, index;
        if (presentNode == null) {
            System.out.println("List is empty");
        }
        while (presentNode != null) {
            index = presentNode.getNext();
            while (index != null) {
                if (presentNode.getData() > index.getData()) {
                    int temp = presentNode.getData();
                    presentNode.setData(index.getData());
                    index.setData(temp);
                }
                index = index.getNext();
            }
            presentNode = presentNode.getNext();
        }
        System.out.println("after ascending");

    }
}