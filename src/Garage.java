import dataimport.Car;
import dataimport.ExcelParser;
import dataimport.JsonParser;
import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Garage {
    private static GaragePrint garagePirnt;
    private static CarwithSpecifiedParameter carwithSpecifiedParameter;
    private static ExcelParser excelParser;
    private static JsonParser jsonParser;

    public static void main(String[] args) throws IOException, ParseException {
        jsonParser = new JsonParser();
        excelParser = new ExcelParser();

        garagePirnt = new GaragePrint();

        ArrayList<Car> garage = jsonParser.importJson();

        System.out.println("Task1.Garage total sum will be " + garagePirnt.calculateGaragePrice(garage));

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
        System.out.println("Found by CarName and Task1.dataimport.Car Model");
        garagePirnt.printGarageCollection(carwithSpecifiedParameter.findBySpecifiedItem(carName1, carModel));


        System.out.println("Enter CarPrice");
        int price = scanner.nextInt();
        System.out.println("Found by price");
        garagePirnt.printGarageCollection(carwithSpecifiedParameter.findBySpecifiedItem(price));
    }


}
