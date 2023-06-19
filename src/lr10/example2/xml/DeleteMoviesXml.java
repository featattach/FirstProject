package lr10.example2.xml;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;

public class DeleteMoviesXml {
    public void deleteMovies(String title) {
        try {
            DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
            Document document = documentBuilder.parse("src/lr10/example2/xml/example2.xml");

            NodeList movies = document.getElementsByTagName("movie");
            for (int i = 0; i < movies.getLength(); i++) {
                Node film = movies.item(i);
                if (film.getNodeType() == Node.ELEMENT_NODE) {
                    Element movieElement = (Element) film;
                    String movieTitle = movieElement.getElementsByTagName("title").item(0).getTextContent();
                    if (movieTitle.equals(title)) {
                        film.getParentNode().removeChild(film);
                    }
                }
            }
            Transformer transformer = TransformerFactory.newDefaultInstance().newTransformer();
            DOMSource domSource = new DOMSource(document);
            StreamResult streamResult = new StreamResult(new File("src/lr10/example2/xml/example2.xml"));
            transformer.transform(domSource, streamResult);

            System.out.println("Фильм " + title + " удален");
        } catch (Exception e) {
            System.err.println(e);
        }
    }
}