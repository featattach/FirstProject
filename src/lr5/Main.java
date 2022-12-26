package lr5;

public class Main {
    public static void main(String[] args) {
        Example1 test1 = new Example1();

        test1.setCh1('K');
        System.out.println("getCodeSymbol " + test1.getCodeSymbol());
        test1.showCodeAndValue();


    }

}

//    Напишите программу с классом, в котором есть закрытое символьное поле
//        и три открытых метода. Один из методов позволяет присвоить значение полю.
//        Еще один метод при вызове возвращает результатом код символа. Третий
//        метод позволяет вывести в консольное окно символ (значение поля) и его код.