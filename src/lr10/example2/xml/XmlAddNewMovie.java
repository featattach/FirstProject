package lr10.example2.xml;

import org.w3c.dom.*;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;

public class XmlAddNewMovie {
    public void getNewMovie(String nameOfMovie, String evaluation, String year) {
        try {
            DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();

            Document document = documentBuilder.parse("src/lr10/example2/xml/example2.xml");
            Element rootElement = document.getDocumentElement();

            Element movie3 = document.createElement("movie");
            rootElement.appendChild(movie3);

            Element title3 = document.createElement("title");
            title3.appendChild(document.createTextNode(nameOfMovie));
            movie3.appendChild(title3);

            Element evaluation3 = document.createElement("evaluation");
            evaluation3.appendChild(document.createTextNode(evaluation));
            movie3.appendChild(evaluation3);

            Element year3 = document.createElement("year");
            year3.appendChild(document.createTextNode(year));
            movie3.appendChild(year3);

            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource Source = new DOMSource(document);
            StreamResult streamResult = new StreamResult(new File("src/lr10/example2/xml/example2.xml"));
            transformer.transform(Source, streamResult);

            System.out.println("Фильм был успешно добавлен в XML-файл");


        } catch (Exception e) {
            System.err.println("Error: " + e);
        }
    }
}
