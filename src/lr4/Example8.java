package lr4;

import java.util.Arrays;
import java.util.Scanner;

public class Example8 {
    private static class Ceaser {
        static String encrTxt;

        private static String encrypt(String enText, int key) {
            char[] ArrayTxt = enText.toCharArray();
            int[] ints = new int[ArrayTxt.length];
            for (int i = 0; i < ArrayTxt.length; i++) {
                ints[i] = ArrayTxt[i];
                ints[i] = ints[i] + key;
            }
            for (int i = 0; i < ArrayTxt.length; i++) {
                ArrayTxt[i] = (char) ints[i];
            }
            encrTxt = new String(ArrayTxt);
            return encrTxt;
        }


        private static String decrypt(String enText, int key) {
            char[] ArrayTxt = enText.toCharArray();
            int[] ints = new int[ArrayTxt.length];
            for (int i = 0; i < ArrayTxt.length; i++) {
                ints[i] = ArrayTxt[i];
                ints[i] = ints[i] - key;
            }
            for (int i = 0; i < ArrayTxt.length; i++) {
                ArrayTxt[i] = (char) ints[i];
            }
            encrTxt = new String(ArrayTxt);
            return encrTxt;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите текст для шифрования");
        String value = in.nextLine();

        System.out.println("Введите ключ для шифрования");
        int key = in.nextInt();
        String encryptStr = Ceaser.encrypt(value, key);
        System.out.print("Текст после проеобразования :" + encryptStr);
        System.out.println("Выполнить обратное проеобразовани? (y/n)");
        boolean iterator = false;
        while (!iterator) {
            String usanswer = in.next();
            if (usanswer.toLowerCase().equals("y")) {
                String decryptStr = Ceaser.decrypt(encryptStr, key);
                System.out.println(decryptStr);
                iterator = true;
            } else if (usanswer.toLowerCase().equals("n")) {
                System.out.println("До свидания!");
                iterator = true;
            } else {
                System.out.println("Введите корректный ответ");
                iterator = false;
            }
        }
    }
}



