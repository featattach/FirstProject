//5. Напишите программу с классом, у которого есть закрытое целочисленное
//        поле. Значение полю присваивается с помощью открытого метода. Методу
//        аргументом может передаваться целое число, а также метод может вызываться
//        без аргументов. Если методы вызывается без аргументов, то поле получает
//        нулевое значение. Если метод вызывается с целочисленным аргументом, то
//        это значение присваивается полю. Однако если переданное аргументом
//        методу значение превышает 100, то значением полю присваивается число 100.
//        Предусмотрите в классе конструктор, который работает по тому же принципу
//        что и метод для присваивания значения полю. Также в классе должен быть
//        метод, позволяющий проверить значение поля.

package lr5;

public class Example5 {
    public static void main(String[] args) {
        Lab5 test05 = new Lab5(20);
        System.out.println("Число "+ test05.Check());

        test05.setA(15);
        System.out.println("Число "+ test05.Check());
        test05.setA(125);
        System.out.println("Число "+ test05.Check());
        test05.setA(-50);
        System.out.println("Число "+ test05.Check());
        test05.setA();
        System.out.println("Число "+ test05.Check());
    }

}
    class Lab5 {
        private int a;

        public void setA(int x) {
            a = x;
            if ( x >= 100){
                a = 100;
        }
            if (x <= 0){
                a = 0;
            }
    }
    public void setA(){
            a = 0;
    }
    public int Check(){
            return a;
        }
        Lab5(int a){
            this.setA(a);
        }


}
