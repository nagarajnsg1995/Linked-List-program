package com.bridgrlabz;

public class LinkedMain {
    public static void main(String[] args) {

        LinkedListLogic functionClass = new LinkedListLogic();
        functionClass.insertNode(56);
        functionClass.insertLast(70);
        functionClass.insertBetween(56, 70, 30);
        functionClass.toPrint();
    }
}