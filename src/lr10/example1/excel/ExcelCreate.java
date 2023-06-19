package lr10.example1.excel;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.*;
import org.apache.poi.xssf.usermodel.extensions.*;

import java.io.FileOutputStream;
import java.io.IOException;


public class ExcelCreate {
    public static void main(String[] args) throws IOException {
            XSSFWorkbook workbook = new XSSFWorkbook();
            XSSFSheet sheet = workbook.createSheet("Товары");

            Row headerRow = sheet.createRow(0);
            headerRow.createCell(0).setCellValue("Товары");
            headerRow.createCell(1).setCellValue("Характеристики");
            headerRow.createCell(2).setCellValue("Стоимость");

            Row dataRow1 = sheet.createRow(1);
            dataRow1.createCell(0).setCellValue("Книга");
            dataRow1.createCell(1).setCellValue("Жарно: Фантастика, Автор: Иванов И.И.");
            dataRow1.createCell(2).setCellValue(500);

            Row dataRow2 = sheet.createRow(2);
            dataRow2.createCell(0).setCellValue("Компьютер");
            dataRow2.createCell(1).setCellValue("Процессор: Intel Core i5, Оперативная память: 8 гб");
            dataRow2.createCell(2).setCellValue(25000);

            String filePath = "src/lr10/example1/excel/example.xlsx";
            FileOutputStream fileOutputStream = new FileOutputStream(filePath);
            workbook.write(fileOutputStream);
            workbook.close();
            fileOutputStream.close();

            System.out.println("Данные записаны в файл: " + filePath);
    }
}
