package lr10.example1.json;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.FileWriter;

public class JsonParserCreate {
    public static void main(String[] args) {
        JSONObject library = new JSONObject();
        JSONArray books = new JSONArray();

        JSONObject book1 = new JSONObject();
        book1.put("title", "Война и мир");
        book1.put("author", "Лев Толстой");
        book1.put("year", 1869);

        JSONObject book2 = new JSONObject();
        book2.put("title", "Мастер и Маргарита");
        book2.put("author", "Михаил Булгаков");
        book2.put("year", 1967);

        books.add(book1);
        books.add(book2);

        library.put("books", books);

        try (FileWriter fileWriter = new FileWriter("src/lr10/example1/json/example-json.json")) {
            fileWriter.write(library.toString());
            System.out.println("Json-файл успешно создан");
        } catch (Exception e) {
            System.err.println("Error " + e);;
        }

    }
}
