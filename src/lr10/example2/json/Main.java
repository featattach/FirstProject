package lr10.example2.json;

public class Main {
    public static void main(String[] args) {
        JsonCreate jsonCreate = new JsonCreate();
        jsonCreate.jsonCreate();

        JsonAddNewMovie jsonAddNewMovie = new JsonAddNewMovie();
        jsonAddNewMovie.jsonAddNewMovie("Ford против Ferrari", "8.2", "2019");

        SearchMoviesJson searchMoviesJson = new SearchMoviesJson();
        searchMoviesJson.searchMoviesForName("Джентельмены");
        searchMoviesJson.searchMoviesForYear("2019");

//        DeleteMoviesJson deleteMoviesJson = new DeleteMoviesJson();
//        deleteMoviesJson.deleteMovie("Джентельмены");


    }
}
