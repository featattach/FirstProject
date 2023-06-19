package lr8.example2;

import java.nio.charset.StandardCharsets;
import java.util.Locale;
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.io.File;
public class Example2 {
    public static void main(String[] args) throws Exception {

// Создаем файл
        File file = new File("C:\\file\\input.txt");
        file.createNewFile();

        try (PrintWriter writer = new PrintWriter(file, StandardCharsets.UTF_8)) {
// Записываем данные в файл
            writer.println("First");
            writer.println("Second");
            for (int i = 0; i < 5; i++) {
                double randomNum = Math.random() * 15;
                writer.println(randomNum);
            }
        }
        try (Scanner scanner = new Scanner(new FileInputStream("C:\\file\\input.txt"), StandardCharsets.UTF_8)
                .useLocale(Locale.ROOT);
             PrintWriter writer = new PrintWriter(new FileOutputStream("C:\\file\\output.txt"), true)) {

// Читаем первую строку
            String firstLine = scanner.nextLine();

// Записываем в файл вторую строку
            String secondLine = scanner.nextLine();
            writer.println(secondLine);

// Читаем и записываем положительные числа
            for (int i = 0; i < 5; i++) {
                if (scanner.hasNextDouble()) {
                    double num = Double.parseDouble(scanner.next());

                    if (num > 0) {
                        writer.println(num);
                    }
                } else {
                    System.out.println("Не найдено");
                    break;
                }
            }
        }
    }
}

/*Создать проект, позволяющий из одного, предварительно
созданного программными средствами файла, переписать данные,
соответствующие условию - в исходном файле содержится две строки в
формате UTF-8 и 5 чисел типа double. В результирующий файл переписать
вторую строку и положительные числа.
 */