package lr11.example3.example8;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addTail(1);
        list.addTail(2);
        list.print();

        list.addHead(3);
        list.print();

        list.addTail(4);
        list.print();

        list.addFirst(5);
        list.print();

        list.addLast(6);
        list.print();

        list.insert(9, 2);
        list.print();

        list.removeFirst();
        list.print();

        list.removeLast();
        list.print();

        list.remove(4);
        list.print();
    }
}
