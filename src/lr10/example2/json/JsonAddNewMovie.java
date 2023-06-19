package lr10.example2.json;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;


import java.io.FileReader;
import java.io.FileWriter;

public class JsonAddNewMovie {
    public void jsonAddNewMovie(String nameOfMovie, String evaluation, String year) {
        try {
            JSONParser jsonParser = new JSONParser();
            Object object = jsonParser.parse(new FileReader("src/lr10/example2/json/example2-json.json"));
            JSONObject jsonObject = (JSONObject) object;
            JSONArray jsonArray = (JSONArray) jsonObject.get("movies");

            JSONObject movie3 = new JSONObject();
            movie3.put("title", nameOfMovie);
            movie3.put("evaluation", evaluation);
            movie3.put("year", year);

            jsonArray.add(movie3);

            jsonObject.put("movies", jsonArray);

            FileWriter fileWriter = new FileWriter("src/lr10/example2/json/example2-json.json");
            fileWriter.write(jsonObject.toString());
            fileWriter.flush();
            fileWriter.close();
            System.out.println("Фильм был успешно добавлен в XML-файл");
        } catch (Exception e) {
            System.err.println("Error:" + e);
        }
    }
}