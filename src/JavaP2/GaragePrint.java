package JavaP2;

import JavaP2.dataimport.Car;

import java.util.ArrayList;

public class GaragePrint {


    public int calculateGaragePrice(ArrayList<Car> garage) {
        int totalGaragePrice = 0;
        for (int i = 0; i < garage.size(); i++) {
            totalGaragePrice += garage.get(i).getPrice();
        }
        return totalGaragePrice;
    }

    public void printGarageCollection(ArrayList<Car> garage) {

        for (Car car : garage) {
            System.out.println(String.format("{carName:'%s',CarModel:'%s',colour:'%s',price:'%s',fuelConsuption:'%s'}", car.getCarName(), car.getCarModel(),  car.getColour(), car.getPrice(), car.getFuelConsumption()
            ));
        }

    }


}
