package JavaP2.dataimport;

public class Car {

    private String carName;
    private String carModel;
    private String colour;
    private int price;

    private double fuelConsumption;

    public Car(String carName, String carModel, String colour, int price, double fuelConsumption) {
        this.carName = carName;
        this.carModel = carModel;
        this.colour = colour;
        this.price = price;
        this.fuelConsumption = fuelConsumption;

    }

    public Car() {

    }

    public String getCarName() {
        return carName;
    }

    public String getCarModel() {
        return carModel;
    }

    public String getColour() {
        return colour;
    }

    public int getPrice() {
        return price;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }
}
