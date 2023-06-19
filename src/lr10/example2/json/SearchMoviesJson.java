package lr10.example2.json;


import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;

public class SearchMoviesJson {
    public void searchMoviesForName(String movie) {
        try {
            JSONParser jsonParser = new JSONParser();
            Object object = jsonParser.parse(new FileReader("src/lr10/example2/json/example2-json.json"));
            JSONObject jsonObject = (JSONObject) object;
            System.out.println("Корневой элемент: " + jsonObject.keySet().iterator().next());
            Object movies = jsonObject.get("movies");

            if (movies instanceof JSONArray) {
                JSONArray jsonArray = (JSONArray) movies;
                boolean found = false;
                for (Object o : jsonArray) {
                    JSONObject film = (JSONObject) o;
                    if (film.get("title").equals(movie)) {
                        System.out.println("Название фильма: " + film.get("title"));
                        System.out.println("Оценка фильма: " + film.get("evaluation"));
                        System.out.println("Год выхода: " + film.get("year"));
                        found = true;
                    }
                }
                if (!found) {
                    System.out.println("Фильма по запросу " + movie + " не найдено");
                }
            }
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
    }
    public void searchMoviesForYear(String year) {
        try {
            JSONParser jsonParser = new JSONParser();
            Object object = jsonParser.parse(new FileReader("src/lr10/example2/json/example2-json.json"));
            JSONObject jsonObject = (JSONObject) object;
            System.out.println("Корневой элемент: " + jsonObject.keySet().iterator().next());
            Object movies = jsonObject.get("movies");

            if (movies instanceof JSONArray) {
                JSONArray jsonArray = (JSONArray) movies;
                boolean found = false;
                for (Object o : jsonArray) {
                    JSONObject film = (JSONObject) o;
                    if (film.get("year").equals(year)) {
                        System.out.println("Название фильма: " + film.get("title"));
                        System.out.println("Оценка фильма: " + film.get("evaluation"));
                        System.out.println("Год выхода: " + film.get("year"));
                        found = true;
                    }
                }
                if (!found) {
                    System.out.println("Фильма по запросу " + year + " не найдено");
                }
            }
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
    }
}
