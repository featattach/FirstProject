package lr1;

import java.util.Scanner;

public class Example11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите Ваше имя: ");
        String name = in.nextLine();

        System.out.println("Введите год Вашего рождения: ");
        int year = in.nextInt();

        int result = 2022 - year;

        System.out.println(name + " Ваш возраст - " + result + " лет");
        in.close();
    }
}
