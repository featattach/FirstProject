package lr6;
//Напишите программу с классом, в котором есть закрытое статическое
//        целочисленное ноле с начальным нулевым значением. В классе должен быть описан
//        статический метод, при вызове которого отображается текущее значение статического
//        поля, после чего значение поля увеличивается на единицу
public class Example2 {
    public static class Test{
        private static int int1;
        public static void look() {
            System.out.println(int1);
            int1++;
        }
    }

    public static void main(String[] args) {
        Test ex2 = new Test();
        ex2.look();
        ex2.look();
        ex2.look();
        ex2.look();

    }

}
