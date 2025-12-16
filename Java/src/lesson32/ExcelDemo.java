package lesson32;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class ExcelDemo {
    public static void main(String[] args) throws IOException {
        String fullPath = System.getProperty("user.dir") + "/extra/Excel.xlsx";
        System.out.println(fullPath);

        FileInputStream fis = new FileInputStream(fullPath);
        // Read whole excel file
        Workbook book = new XSSFWorkbook(fis);
        // Get one sheet from the excel file
        Sheet sheet = book.getSheet("Sheet1");

        // Get the row in index 2 from sheet
        Row row2 = sheet.getRow(2);

        // Get the cekk in index3 from the row
        Cell cell3 = row2.getCell(3);

        // Print the info
//        System.out.println(cell3);

        Row headerRow = sheet.getRow(0);
        int cellNum = headerRow.getLastCellNum();
        int rows = sheet.getPhysicalNumberOfRows();
        DataFormatter df = new DataFormatter();
        for (int i = 0; i < rows; i++) {
            Row currentRow = sheet.getRow(i);
            if (currentRow == null) continue;

            for (int j = 0; j < cellNum; j++) {
                Cell cell = currentRow.getCell(j);
                String cellValue = df.formatCellValue(cell);
                System.out.printf("%-15s", cellValue);
            }
            System.out.println();
        }
    }
}
