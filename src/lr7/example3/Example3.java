package lr7.example3;

public class Example3 {
    public static void main(String[] args) {
        FirstSubClass superClassTest = new FirstSubClass(512);
        String className1 = superClassTest.toString();
        System.out.println(className1);

        SecondSubClass FirstSubClassTest = new SecondSubClass(1024,'K');
        String className2 = FirstSubClassTest.toString();
        System.out.println(className2);

        ThirdSubClass SecondSubClassTest = new ThirdSubClass(1024,'K',"кибибайт");
        String className3 = SecondSubClassTest.toString();
        System.out.println(className3);
    }
}
