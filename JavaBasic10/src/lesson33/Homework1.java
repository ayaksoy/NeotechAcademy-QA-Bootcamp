package lesson33;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Homework1 {
    static public String fullPath = System.getProperty("user.dir") + "/extra/Homework.xlsx";

    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream(fullPath);

        Workbook book = new XSSFWorkbook(fis);

        Sheet sheet = book.getSheet("Companies");

        Row row3 = sheet.getRow(2);
        List<String> thirdRow = new ArrayList<>();
        for (int i = 0; i < row3.getLastCellNum(); i++) {
            thirdRow.add(row3.getCell(i).toString());
        }
        System.out.println(thirdRow);
    }
}
