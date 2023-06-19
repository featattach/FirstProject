package lr10.example2.json;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.FileWriter;

public class JsonCreate {
    public void jsonCreate() {
        JSONObject kinopoisk = new JSONObject();
        JSONArray movies = new JSONArray();

        JSONObject movie1 = new JSONObject();
        movie1.put("title", "Зеленая миля");
        movie1.put("evaluation", "9.1");
        movie1.put("year", "1999");

        JSONObject movie2 = new JSONObject();
        movie2.put("title", "Джентельмены");
        movie2.put("evaluation", "8.5");
        movie2.put("year", "2019");

        movies.add(movie1);
        movies.add(movie2);

        kinopoisk.put("movies", movies);

        try (FileWriter fileWriter = new FileWriter("src/lr10/example2/json/example2-json.json")) {
            fileWriter.write(kinopoisk.toString());
            System.out.println("Json-файл успешно создан");
        } catch (Exception e) {
            System.err.println("Error " + e);
        }
    }
}