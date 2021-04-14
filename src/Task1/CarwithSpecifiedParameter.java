package Task1;

import java.util.ArrayList;

public class CarwithSpecifiedParameter {

    private ArrayList<Car> garage;

    public CarwithSpecifiedParameter(ArrayList<Car> garage) {
        this.garage = garage;
    }

    public ArrayList<Car> findBySpecifiedItem(String carName) {
        ArrayList<Car> cars = new ArrayList<>();
        for (int i = 0; i < garage.size(); i++) {
            if (carName.equalsIgnoreCase(garage.get(i).getCarName())) {
                cars.add(garage.get(i));
            }
        }

        return cars;
    }

    public ArrayList<Car> findBySpecifiedItem(String carName, String carModel) {
        ArrayList<Car> cars = new ArrayList<>();
        for (int i = 0; i < garage.size(); i++) {
            if (carName.equalsIgnoreCase(garage.get(i).getCarName()) && carModel.equalsIgnoreCase(garage.get(i).getCarModel())) {
                cars.add(garage.get(i));
            }
        }
        return cars;

    }

    public ArrayList<Car> findBySpecifiedItem(int price) {
        ArrayList<Car> cars = new ArrayList<>();
        for (int i = 0; i < garage.size(); i++) {
            if (price == garage.get(i).getPrice()) {
                cars.add(garage.get(i));
            }
        }
        return cars;
    }


}
