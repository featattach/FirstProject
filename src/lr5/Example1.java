package lr5;
public class Example1 {
    public static void main(String[] args) {
        lab1 test1 = new lab1();

        test1.setCh1('K');
        System.out.println("getCodeSymbol " + test1.getCodeSymbol());
        test1.showCodeAndValue();


    }
}
class lab1 {
    private char ch1;

    public void setCh1(char ch1) {
        this.ch1 = ch1;
    }

    public int getCodeSymbol(){
        return ch1;
    }
    public void showCodeAndValue(){
        System.out.println("Value = " + ch1);
        System.out.println("Code = " + (int)ch1);
    }

}

