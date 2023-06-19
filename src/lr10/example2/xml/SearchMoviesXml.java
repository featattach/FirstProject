package lr10.example2.xml;

import org.w3c.dom.*;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SearchMoviesXml {
    public void searchForName(String movie) {
        try {
            DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
            Document doc = documentBuilder.parse(new File("src/lr10/example2/xml/example2.xml"));
            doc.getDocumentElement().normalize();
            System.out.println("Корневой элемент: " + doc.getDocumentElement().getNodeName());

            NodeList movies = doc.getElementsByTagName("movie");
            List<Element> search = new ArrayList<>();

            for (int i = 0; i < movies.getLength(); i++) {
                Element film = (Element) movies.item(i);
                if (film.getElementsByTagName("title").item(0).getTextContent().equalsIgnoreCase(movie)) {
                    search.add(film);
                }
            }

            if (search.size() == 0) {
                System.out.println("Фильма по запросу " + movie + " не найдено");
            } else {
                for (Element film : search) {
                    System.out.println("Название фильма: " + film.getElementsByTagName("title").item(0).getTextContent());
                    System.out.println("Оценка фильма: " + film.getElementsByTagName("evaluation").item(0).getTextContent());
                    System.out.println("Год выхода: " + film.getElementsByTagName("year").item(0).getTextContent());
                    System.out.println();
                }
            }
        } catch (IOException | SAXException | ParserConfigurationException e) {
            System.err.println("Error: " + e);
        }
    }
    public void searchForYear(String year) {
        try {
            DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
            Document doc = documentBuilder.parse(new File("src/lr10/example2/xml/example2.xml"));
            doc.getDocumentElement().normalize();

            NodeList movies = doc.getElementsByTagName("movie");
            List<Element> search = new ArrayList<>();

            for (int i = 0; i < movies.getLength(); i++) {
                Element film = (Element) movies.item(i);
                if (film.getElementsByTagName("year").item(0).getTextContent().equalsIgnoreCase(year)) {
                    search.add(film);
                }
            }

            if (search.size() == 0) {
                System.out.println("Фильма по запросу не найдено " + year);
            } else {
                for (Element film : search) {
                    System.out.println("Название фильма: " + film.getElementsByTagName("title").item(0).getTextContent());
                    System.out.println("Оценка фильма: " + film.getElementsByTagName("evaluation").item(0).getTextContent());
                    System.out.println("Год выхода: " + film.getElementsByTagName("year").item(0).getTextContent());
                    System.out.println();
                }
            }
        } catch (IOException | SAXException | ParserConfigurationException e) {
            System.err.println("Error: " + e);
        }
    }
}