package lr10.example1.linkParser;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class LinkParser {
    public static void main(String[] args) {
        String url = "https://itlearn.ru/first-steps";
        try {
            Document doc = Jsoup.connect(url).get();
            Elements links = doc.select("a[href]");

            for (Element link : links) {
                System.out.println(link.text() + " - " + link.attr("href"));
            }

        } catch (IOException e) {
            System.err.println("Error: " + e);
        }
    }
}
