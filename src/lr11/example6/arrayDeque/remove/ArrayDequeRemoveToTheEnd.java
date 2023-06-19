package lr11.example6.arrayDeque.remove;

public class ArrayDequeRemoveToTheEnd {
    public static void main(String[] args) {
        java.util.ArrayDeque<Integer> arrayDeque = new java.util.ArrayDeque<>();
        for (int i = 0; i < 11000000; i++) {
            arrayDeque.add(i);
        }
        System.out.println("Время выполнения операции удаления arrayDeque = " + getRunningTime(arrayDeque));
    }
    private static long getRunningTime(java.util.ArrayDeque<Integer> list){
        long start = System.currentTimeMillis();

        for (int i = 0; i < 1; i++) {
            list.removeLast();
        }
        long end = System.currentTimeMillis();

        return end - start;

    }
}
