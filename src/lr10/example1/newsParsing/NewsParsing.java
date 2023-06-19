package lr10.example1.newsParsing;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;

public class NewsParsing {
    public static void main(String[] args) {
        try {
            Document doc = Jsoup.connect("http://fat.urfu.ru/index.html").get();
            Elements newsParent = doc.select("body > table > tbody > tr > td > div > table > tbody > tr > td > table > tbody > tr > td > table > tbody > tr > td[class=blocktitle]");
            Elements dateParent = doc.select("body > table > tbody > tr > td > div > table > tbody > tr > td > table > tbody > tr > td > table > tbody > tr > td[class=blockdate]");

            for (int i = 3; i < 12; i++) {
                String nodesNews = newsParent.select("td[class=blocktitle]").get(i).text();
                System.out.println("Тема: " + nodesNews);
                String nodesDate = dateParent.select("td[class=blockdate]").get(i - 3).text();
                System.out.println("Дата: " + nodesDate + "\n");
            }
        } catch (IOException e) {
            System.err.println("Error: " + e);
        }
    }
}
