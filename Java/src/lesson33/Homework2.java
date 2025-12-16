package lesson33;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class Homework2 {
    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream(Homework1.fullPath);

        Workbook book = new XSSFWorkbook(fis);

        Sheet sheet = book.getSheet("Companies");


        Set<Double> fifthColumn = new HashSet<>();
        for (int i = 1; i <= sheet.getLastRowNum(); i++) {
            Row row = sheet.getRow(i);
            fifthColumn.add(Double.parseDouble(row.getCell(4).toString()));
        }
        System.out.println(fifthColumn);
    }
}
