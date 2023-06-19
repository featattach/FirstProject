package lr10.example2.xml;

import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, ParserConfigurationException, SAXException {
        XmlCreate xmlCreate = new XmlCreate();
        xmlCreate.xmlCreate();

        XmlAddNewMovie xmlAddMovie = new XmlAddNewMovie();
        xmlAddMovie.getNewMovie("Ford против Ferrari", "8.2", "2019");

        SearchMoviesXml searchMovies = new SearchMoviesXml();
        searchMovies.searchForName("Джентельмены");
        searchMovies.searchForYear("2019");


//        DeleteMovies deleteMovies = new DeleteMovies();
//        deleteMovies.deleteMovies("Зеленая миля");

    }
}
