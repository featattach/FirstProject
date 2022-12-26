package test;

public class Cat {
    String name;
    int age;

    public void sayMeow() {
        System.out.println("Мяу!");
    }
    public void jump() {
        System.out.println("Прыг-скок!");
    }

    public static void main(String[] args) {
    Cat barsik = new Cat();
    barsik.age = 3;
    barsik.name = "Барсик";

    barsik.sayMeow();
    barsik.jump();
    System.out.println("Мы создали кота по имени " + barsik.name + ", его возраст - " + barsik.age);
    }
}

