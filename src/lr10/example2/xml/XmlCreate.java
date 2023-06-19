package lr10.example2.xml;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;


public class XmlCreate {
    public void xmlCreate() {
        try {
            DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();

            Document document = documentBuilder.newDocument();

            Element rootElement = document.createElement("kinopoisk");
            document.appendChild(rootElement);

            Element movie1 = document.createElement("movie");
            rootElement.appendChild(movie1);

            Element title1 = document.createElement("title");
            title1.appendChild(document.createTextNode("Зеленая миля"));
            movie1.appendChild(title1);

            Element evaluation1 = document.createElement("evaluation");
            evaluation1.appendChild(document.createTextNode("9.1"));
            movie1.appendChild(evaluation1);

            Element year1 = document.createElement("year");
            year1.appendChild(document.createTextNode("1999"));
            movie1.appendChild(year1);

            Element movie2 = document.createElement("movie");
            rootElement.appendChild(movie2);

            Element title2 = document.createElement("title");
            title2.appendChild(document.createTextNode("Джентельмены"));
            movie2.appendChild(title2);

            Element evaluation2 = document.createElement("evaluation");
            evaluation2.appendChild(document.createTextNode("8.5"));
            movie2.appendChild(evaluation2);

            Element year2 = document.createElement("year");
            year2.appendChild(document.createTextNode("2019"));
            movie2.appendChild(year2);


            document.setXmlStandalone(true);
            document.normalizeDocument();
            Transformer transformer = TransformerFactory.newDefaultInstance().newTransformer();
            transformer.setOutputProperty(OutputKeys.STANDALONE, "yes");
            transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            DOMSource domSource = new DOMSource(document);
            StreamResult streamResult = new StreamResult(new File("src/lr10/example2/xml/example2.xml"));
            transformer.transform(domSource, streamResult);

        System.out.println("XML-файл успешно создан");

        } catch (Exception e) {
            System.err.println("Error: " + e);
        }
    }

}
