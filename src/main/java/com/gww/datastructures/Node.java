package com.gww.datastructures;

public class Node {
    private int value;
    private Node next;

    public int getValue() {
        return this.value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Node getNext() {
        return this.next;
    }

    public void setNext(Node pointer) {
        this.next = pointer;
    }
}
