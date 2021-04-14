package Task1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Garage {
    private static GaragePrint garagePirnt;
    private static CarwithSpecifiedParameter carwithSpecifiedParameter;

    public static void main(String[] args) {
        garagePirnt = new GaragePrint();

        ArrayList<Car> garage = new ArrayList<>();
        garage.add(new Car("Mercedes", "S320", "black", 5650, 13.2));
        garage.add(new Car("Audi", "S8", "red", 7690, 10.1));
        garage.add(new Car("Peugeot", "406", "red", 8500, 18.3));
        garage.add(new Car("Peugeot", "405", "black", 8500, 12.1));


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
        System.out.println("Found by CarName and Task1.Car Model");
        garagePirnt.printGarageCollection(carwithSpecifiedParameter.findBySpecifiedItem(carName1, carModel));


        System.out.println("Enter CarPrice");
        int price = scanner.nextInt();
        System.out.println("Found by price");
        garagePirnt.printGarageCollection(carwithSpecifiedParameter.findBySpecifiedItem(price));
    }


}
