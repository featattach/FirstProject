package lr8.example1;

import java.io.File;

public class Example1 {
    public static void main(String[] args) {

       // Создание файла в текущей папке
        try {
           File f1 = new File("MyFile1.txt");
           f1.createNewFile();
           if (f1.exists()) {
               System.out.println("Файл создан");
               System.out.println("Полный путь f1 " + f1.getAbsolutePath());
           }

        // Создание файла на диске C и вывод полного пути
            File f2 = new File("C:\\file\\MyFile2.txt");
            f2.createNewFile();
            System.out.println("Полный путь f2 " + f2.getAbsolutePath());

        // Создание нескольких вложенных папок
            File f3 = new File("C:\\file\\Papka1\\Papka2\\Papka3");
            f3.mkdirs();
            System.out.println("Полный путь f3 " + f3.getAbsolutePath());
        } catch (Exception e) {
            System.out.println("Ошибка " + e);
        }
    }
}