package lr7.example4;

public class Example4 {
    public static void main(String[] args) {
        //super Class test
        FirstSupClass superClassTest = new FirstSupClass('A');
        String className1 = superClassTest.toString();
        System.out.println(className1);
        //super Class copy test
        FirstSupClass superClassTestCopy = new FirstSupClass(superClassTest);
        String className1copy = superClassTestCopy.toString();
        System.out.println(className1copy);
        //1 subClass test
        SecondSubClass FirstSubClassTest = new SecondSubClass('A',"AAA");
        String className2 = FirstSubClassTest.toString();
        System.out.println(className2);
        //1 subClass copy test
        SecondSubClass FirstSubClassTestCopy = new SecondSubClass(FirstSubClassTest);
        String className2Copy = FirstSubClassTestCopy.toString();
        System.out.println(className2Copy);
        //2 subClass test
        ThirdSubClass SecondSubClassTest = new ThirdSubClass('A',"AAA",512);
        String className3 = SecondSubClassTest.toString();
        System.out.println(className3);
        //2 subClass copy test
        ThirdSubClass SecondSubClassTestCopy = new ThirdSubClass(SecondSubClassTest);
        String className3Copy = SecondSubClassTestCopy.toString();
        System.out.println(className3Copy);
    }
}
