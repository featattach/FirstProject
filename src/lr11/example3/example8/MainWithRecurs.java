package lr11.example3.example8;

public class MainWithRecurs {
    public static void main(String[] args) {
        LinkedListWithRecurs list = new LinkedListWithRecurs();

        list.addHead(1);
        list.addHead(2);
        System.out.println(list.print());

        list.addTail(3);
        list.addTail(4);
        System.out.println(list.print());
    }
}