//. Напишите программу с классом, у которого есть два целочисленных поля.
//        В классе должны быть описаны конструкторы, позволяющие создавать
//        объекты без передачи аргументов, с передачей одного аргумента и с передачей
//        двух аргументов.

package lr5;

public class Example3 {
    public static void main(String[] args) {
        Lab3 test3 = new Lab3(2,5);
        test3.konstr2();
        Lab3 test4 = new Lab3(3);
        test4.konstr1();
        Lab3 test5 = new Lab3();
        test5.zerokonstr();


    }

}

class Lab3 {
    int a;
    int b;

    public Lab3(int a, int b) {
        this.a = a;
        this.b = b;

    }

    public Lab3(int a) {
        this.a = a;
    }

    public Lab3() {

    }

    public void zerokonstr() {
        System.out.println("Пустой конструкт " + a + " + " + b);
    }

    public void konstr1() {
        System.out.println("Конструкт с одним аргументом " + a + " + " + b);
    }

    public void konstr2() {
        System.out.println("Конструкт с двумя аргументами " + a + " + " + b);
    }
}

