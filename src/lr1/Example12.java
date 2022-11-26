package lr1;

import java.util.Scanner;

public class Example12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите Ваш возраст: ");
        int year = in.nextInt();

        int result = 2022 - year;

        System.out.println("Год Вашего рождения - " + result);
        in.close();
    }
}
