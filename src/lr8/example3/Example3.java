package lr8.example3;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class Example3 {
    public static void main(String[] args) throws IOException {
        // Открываем файл для чтения
        BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream("C:\\file\\poemsIn.txt"), StandardCharsets.UTF_8));
        // Открываем файл для записи
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("C:\\file\\poemsOut.txt"), StandardCharsets.UTF_8));

        String line;
        int lineNumber = 1; // номер строки
        while ((line = reader.readLine()) != null) {
            if (line.isEmpty()) {
                continue;
            }
            String[] words = line.split(" "); // разбиваем строку на слова
            int count = 0; // счетчик выбранных слов
            for (String word : words) {
                if (isConsonantWord(word)) { // проверяем, является ли слово начинающимся с согласной буквы
                    writer.write(word + " "); // записываем слово в файл
                    count++;
                }
            }
            // записываем номер строки и количество выбранных слов
            writer.write("(Строка " + lineNumber + ", слово " + count + ")");
            writer.newLine(); // переносим каретку на новую строку
            lineNumber++;
        }

        // закрываем файлы
        reader.close();
        writer.close();
    }

    // метод для проверки, является ли слово начинающимся с согласной буквы

    private static boolean isConsonantWord(String word) {
        char firstLetter = word.charAt(0);
        // согласные буквы
        String consonants = "бвгджзклмнпрстфхцчшщБВГДЖЗКЛМНПРСТФХЦЧШЩ";
        return consonants.indexOf(firstLetter) != -1;
    }
}
