package Task1;

import java.util.Comparator;

public class SortByFuelConsuption implements Comparator<Car> {


    @Override
    public int compare(Car car1, Car car2) {
        if (car1.getFuelConsumption() == car2.getFuelConsumption())
            return 0;
        else if (car1.getFuelConsumption() > car2.getFuelConsumption())
            return 1;
        else
            return -1;
    }

}

