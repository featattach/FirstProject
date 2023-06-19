package lr11.example3.example8;

public class LinkedListWithRecurs {
    private Node head;
    public LinkedListWithRecurs() {
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
    public void addTail(int value) {
        if (head == null) {
            head = new Node(value);
        } else {
            addTail(head, value);
        }
    }

    private void addTail(Node node, int value) {
        if (node.next == null) {
            node.next = new Node(value);
        } else {
            addTail(node.next, value);
        }
    }
    public String print() {
        if (head == null) {
            return "";
        } else {
            return head.data + " " + print(head.next);
        }
    }

    private String print(Node node) {
        if (node == null) {
            return "";
        } else {
            return node.data + " " + print(node.next);
        }
    }
}
