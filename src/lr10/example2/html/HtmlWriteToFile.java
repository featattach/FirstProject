package lr10.example2.html;


import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.FileWriter;
import java.io.IOException;

public class HtmlWriteToFile {
    public static void main(String[] args) {
        String nodesNews = null;
        int count = 0;
        try {
            while (count < 3 && nodesNews == null) {
                FileWriter fileWriter = new FileWriter("src/lr10/example2/html/example2.txt");
                Document doc = Jsoup.connect("http://fat.urfu.ru/index.html").get();
                Elements newsParent = doc.select("body > table > tbody > tr > td > div > table > tbody > tr > td > table > tbody > tr > td > table > tbody > tr > td[class=blocktitle]");
                Elements dateParent = doc.select("body > table > tbody > tr > td > div > table > tbody > tr > td > table > tbody > tr > td > table > tbody > tr > td[class=blockdate]");

                for (int i = 3; i < 12; i++) {
                    nodesNews = newsParent.select("td[class=blocktitle]").get(i).text();
                    System.out.println("Тема: " + nodesNews);
                    fileWriter.write("Тема: " + nodesNews);
                    String nodesDate = dateParent.select("td[class=blockdate]").get(i - 3).text();
                    System.out.println("Дата: " + nodesDate + "\n");
                    fileWriter.write("Дата: " + nodesDate + "\n");
                }
                fileWriter.close();
                count++;
            }
        } catch (IOException e) {
            System.err.println("Ошибка подключения к сайту: " + e);
        }
    }
}