package dataimport;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

public class ExcelParser {
    private FileInputStream fileInputStream;
    private Workbook workbook;
    private ArrayList<Car> garage;

    public ArrayList<Car> importExcel() throws IOException {
        garage = new ArrayList<>();
        fileInputStream = new FileInputStream("resources/Cars.xlsx");
        Workbook carsWorkBook = new XSSFWorkbook(fileInputStream);
        Sheet carsSheet = carsWorkBook.getSheet("Cars");
        int rowCount = carsSheet.getLastRowNum() - carsSheet.getFirstRowNum();
        for (int i = 1; i <= rowCount; i++) {
            Row row = carsSheet.getRow(i);
            DataFormatter dataFormatter = new DataFormatter();



                garage.add(new Car(

                        dataFormatter.formatCellValue(row.getCell(0)),
                        dataFormatter.formatCellValue(row.getCell(1)),
                        dataFormatter.formatCellValue(row.getCell(2)),
                        Integer.parseInt(dataFormatter.formatCellValue(row.getCell(3))),
                        Double.parseDouble(dataFormatter.formatCellValue(row.getCell(4)))

                ));

        }

        return  garage;
    }

}
