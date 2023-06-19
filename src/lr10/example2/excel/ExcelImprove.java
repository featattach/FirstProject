package lr10.example2.excel;

import lr10.example1.excel.ExcelRead;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class ExcelImprove {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите название листа: ");
        String sheetName = in.nextLine();

        String filePath = "src/lr10/example1/excel/example.xlsx";
        FileInputStream fileInputStream = null;

        try {
            fileInputStream = new FileInputStream(filePath);
        } catch (IOException e) {
            System.err.println("Ошибка \"ввода/вывода\" ".toUpperCase() + e);
        }

        XSSFWorkbook workbook = null;
        XSSFSheet sheet = null;

        try {
            workbook = new XSSFWorkbook(fileInputStream);
            sheet = workbook.getSheet((sheetName));
        } catch (FileNotFoundException e) {
            System.err.println("Данный файл не был найден ".toUpperCase() + e);
        } catch (EncryptedDocumentException e) {
            System.err.println("Ошибка \"зашифрованный документ\" ".toUpperCase() + e);
        } catch (Exception e) {
                System.err.println("Файл пустой".toUpperCase());
            }

            for (Row row : sheet) {
                for (Cell cell : row) {
                    System.out.print(cell.toString() + "\t");
                }
                System.out.println();
            }

            workbook.close();
            fileInputStream.close();
        }
    }

