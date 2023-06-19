package lr11.example3.example5;

public class LinkedListTail {
    private static Node head;
    private static Node tail;

    public LinkedListTail() {
        head = null;
        tail = null;
    }

    public void Tail(int value) {
        if (head == null) {
            tail = new Node(value, null);
            head = tail;
        } else {
            tail.next = new Node(value, null);
            tail = tail.next;
        }
    }
    public static void main(String[] args) {
        LinkedListTail list = new LinkedListTail();
        list.Tail(0);
        list.Tail(1);
        list.Tail(2);
        list.Tail(3);

        Node ref = head;
        while (ref != null) {
            System.out.print(" " + ref.value);
            ref = ref.next;
        }
    }
}

