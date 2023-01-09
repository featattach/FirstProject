package lr6;

public class Example1 {
    public static void main(String[] args) {
        MyClass1 myClass1 = new MyClass1();

        myClass1.setCh10rStr1('l');
        myClass1.setCh10rStr1("Привет");

        System.out.println(myClass1.ch1);
        System.out.println(myClass1.str1);

        char[] chars = new char[5];
        chars[0] = 'П';
        chars[1] = 'о';
        chars[2] = 'к';
        chars[3] = 'а';
        chars[4] = '!';

        myClass1.setCh10rStr1(chars);
        System.out.println(myClass1.ch1);
        System.out.println(myClass1.str1);

        char[] chars2 = new char[5];
        chars2[0] = 'Ц';

        myClass1.setCh10rStr1(chars2);

    }
}
class MyClass1 {
    String str1;
    char ch1;
    public void setCh10rStr1(char ch1){
        this.ch1 = ch1;
    }
    public void setCh10rStr1(String str1){
        this.str1 = str1;
    }
    public void setCh10rStr1(char[] chars){
        if(chars.length == 1){
            this.ch1 = chars[0];
        } else if (chars.length > 1 ){
            this.str1 = String.valueOf(chars);
        }
    }

}
