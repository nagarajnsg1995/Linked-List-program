package com.bridgrlabz;

public class LinkedMain {
    public static void main(String[] args) {

        LinkedListLogic linkedListLogic = new LinkedListLogic();
        linkedListLogic.insertFirst(56);
        linkedListLogic.insertLast(70);
        linkedListLogic.insertBetween(56, 70, 30);
        linkedListLogic.toPrint();
        linkedListLogic.searcNode(56);
        linkedListLogic.insertNumber(30,40);
        linkedListLogic.deleteAnyNumber(40);

        linkedListLogic.toPrint();
    }
}