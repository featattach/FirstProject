package lr11.example3.example8;

import java.util.Arrays;

public class LinkedList {
    private Node head;
    public LinkedList() {
        head = null;
    }

    private class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            next = null;
        }
    }

    public void addHead(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void addTail(int data) {
        Node newNode = new Node(data);
        Node currentNode = head;
        if (head == null) {
            head = newNode;
        } else {
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
        }
    }

    public void print() {
        Node currentNode = head;

        String result = "";
        while (currentNode != null) {
            result += currentNode.data;
            currentNode = currentNode.next;
        }
        System.out.println(Arrays.toString(result.toCharArray()));
    }

    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        Node currentNode = head;
        if (head == null) {
            head = newNode;
        } else {
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
        }
    }

    public void insert(int data, int position) {
        Node newNode = new Node(data);
        Node currentNode = head;

        if (position == 1) {
            newNode.next = head;
            head = newNode;
        } else {
            for (int i = 1; i < position - 1; i++) {
                currentNode = currentNode.next;
            }
            newNode.next = currentNode.next;
            currentNode.next = newNode;
        }
    }

    public void removeFirst() {
        Node currentNode = head;
        head = currentNode.next;
    }

    public void removeLast() {
        if(head.next == null) {
            head = null;
        } else {
            Node temp = head;
            while(temp.next.next != null) {
                temp = temp.next;
            }
            temp.next = null;
        }
    }

    public void remove(int position) {
        Node currentNode = head;

        if (position == 1) {
            head = currentNode.next;
        } else {
            for (int i = 1; i < position - 1; i++) {
                currentNode = currentNode.next;
            }
            currentNode.next = currentNode.next.next;
        }
    }

}
