package com.bridgrlabz;

public class LinkedMain {
    public static void main(String[] args) {

        LinkedListLogic linkedListLogic = new LinkedListLogic();
        linkedListLogic.insertNode(56);
        linkedListLogic.insertLast(70);
        linkedListLogic.insertBetween(56, 70, 30);
        linkedListLogic.toPrint();
        linkedListLogic.lastDelete();

        linkedListLogic.toPrint();
    }
}