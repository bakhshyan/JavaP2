package JavaP2;
import JavaP2.dataimport.*;
import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Garage {
    private static GaragePrint garagePirnt;
    private static CarwithSpecifiedParameter carwithSpecifiedParameter;
    private static ExcelParser excelParser;
    private static JsonParser jsonParser;
    private  static SQLParser sqlImport;

    public static void main(String[] args) throws IOException, ParseException, SQLException, ClassNotFoundException {
//        jsonParser = new JsonParser();
//        ArrayList<Car> garage = jsonParser.importJson();

//        excelParser = new ExcelParser();
//        ArrayList<Car> garage = excelParser.importExcel();

        sqlImport = new SQLParser();
        ArrayList<Car> garage = sqlImport.getGarageArray();
        sqlImport.closeConnection();


        garagePirnt = new GaragePrint();
        System.out.println("Task1.JavaP2.Garage total sum will be " + garagePirnt.calculateGaragePrice(garage));

        System.out.println("Before sorting");
        garagePirnt.printGarageCollection(garage);


        Collections.sort(garage, new SortByFuelConsuption());

        System.out.println("After Sorting by fuelConsuption");
        garagePirnt.printGarageCollection(garage);

        carwithSpecifiedParameter = new CarwithSpecifiedParameter(garage);


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Carname");
        String carName = scanner.nextLine();
        System.out.println("Found by Carname");
        garagePirnt.printGarageCollection(carwithSpecifiedParameter.findBySpecifiedItem(carName));


        System.out.println("Enter Carname");
        String carName1 = scanner.nextLine();
        System.out.println("Enter CarModel");
        String carModel = scanner.nextLine();
        System.out.println("Found by CarName and Car Model");
        garagePirnt.printGarageCollection(carwithSpecifiedParameter.findBySpecifiedItem(carName1, carModel));


        System.out.println("Enter CarPrice");
        int price = scanner.nextInt();
        System.out.println("Found by price");
        garagePirnt.printGarageCollection(carwithSpecifiedParameter.findBySpecifiedItem(price));


    }


}
