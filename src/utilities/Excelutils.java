package utilities;

import java.io.FileInputStream;
import java.io.IOException; // Added missing import
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelutils {

    public static Object[][] getTestData(String filepath, String sheetName) throws IOException {
        // Using try-with-resources handles closing resources automatically
        try (FileInputStream fis = new FileInputStream(filepath);
             XSSFWorkbook workbook = new XSSFWorkbook(fis)) {
            
            XSSFSheet sheet = workbook.getSheet(sheetName);
            int rows = sheet.getLastRowNum();
            int cols = sheet.getRow(0).getLastCellNum(); // Fixed 'C' capitalization

            Object[][] data = new Object[rows][cols];
            DataFormatter formatter = new DataFormatter();

            // Loop starts from 1 to skip the header row
            for (int i = 1; i <= rows; i++) { // Fixed 'row' to 'rows'
                for (int j = 0; j < cols; j++) { // Fixed '<=' to '<' to avoid OutOfBounds
                    // Map Excel row 'i' to array index 'i - 1'
                    data[i - 1][j] = formatter.formatCellValue(sheet.getRow(i).getCell(j));
                }
            }
            return data;
        }
    }
}

