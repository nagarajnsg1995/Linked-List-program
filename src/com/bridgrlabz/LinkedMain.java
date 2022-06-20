package com.bridgrlabz;

public class LinkedMain {
    public static void main(String[] args) {

        LinkedListLogic linkedlistlogic = new LinkedListLogic();
        linkedlistlogic.insertNode(56);
        linkedlistlogic.appending(56, 30);
        linkedlistlogic.appending(30, 70);
        linkedlistlogic.toPrint();
    }
}
