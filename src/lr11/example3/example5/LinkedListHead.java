package lr11.example3.example5;

public class LinkedListHead {
    private static Node head;

    public LinkedListHead() {
        head = null;
    }

    public void Head(int value) {
        head = new Node(value, head);
    }
    public static void main(String[] args) {
        LinkedListHead list = new LinkedListHead();
        list.Head(4);
        list.Head(3);
        list.Head(2);
        list.Head(1);

        Node ref = head;
        while (ref != null) {
            System.out.print(" " + ref.value);
            ref = ref.next;
        }
    }
}
