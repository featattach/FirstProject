package lr11.example3.example1;
public class Example5 {
    public static int fib(int x) {
        System.out.println(x);
        if (x == 0) {
            return 0;
        } else if (x == 1) {
            return 1;
        } else {
            return fib(x - 1) + fib(x - 2);
        }
    }

    public static void main(String[] args) {
        System.out.println(fib(6));
    }
}
