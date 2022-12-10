package lr3;

import java.util.Objects;
import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите названия дня недели");
        String day = in.nextLine();

        switch (day) {
            case "понедельник":
                System.out.println("switch | 1");
                break;
            case "вторник":
                System.out.println("switch | 2");
                break;
            case "среда":
                System.out.println("switch | 3");
                break;
            case "четверг":
                System.out.println("switch | 4");
                break;
            case "пятница":
                System.out.println("switch | 5");
                break;
            case "суббота":
                System.out.println("switch | 6");
                break;
            case "воскресенье":
                System.out.println("switch | 7");
                break;
            default:
                System.out.println("switch | что то не то");
        }
        if (day.equals("понедельник") || day.equals("вторник") || day.equals("среда") || day.equals("четверг") || day.equals("пятница") ||
                day.equals("суббота") || day.equals("воскресенье")) {
            if (day.equals("понедельник")) {
                System.out.println("if " + 1);
            }
            if (day.equals("вторник")) {
                System.out.println("if |" + 2);
            }
            if (day.equals("среда")) {
                System.out.println("if |" + 3);
            }
            if (day.equals("четверг")) {
                System.out.println("if |" + 4);
            }
            if (day.equals("пятница")) {
                System.out.println("if |" + 5);
            }
            if (day.equals("суббота")) {
                System.out.println("if |" + 6);
            }
            if (day.equals("воскресенье")) {
                System.out.println("if |" + 7);
            }
        }else {
            System.out.println("if | что-то не то");
        }

    }
}
//2. Напишите программу, в которой пользователю предлагается
//        ввести название дня недели. По введенному названию программа определяет
//        порядковый номер дня в неделе. Если пользователь вводит неправильное
//        название дня, программа выводит сообщение о том, что такого дня нет.
//        Предложите версию программы на основе вложенных условных операторов и
//        на основе оператора выбора switch.