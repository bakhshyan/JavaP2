package JavaP1;

import java.util.ArrayList;

public class ArrayRevert {
    String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};

    public static void main(String[] args) {
        ArrayRevert arrayRevert = new ArrayRevert();

        System.out.println("Cars Array");
        for (String car : arrayRevert.cars) {
            System.out.print(car + ",");

        }

        System.out.println();
        System.out.println("Reverted Cars Array");
        for (String car : arrayRevert.revertArray()) {
            System.out.print(car + ",");

        }

    }

    private ArrayList<String> revertArray() {
        ArrayList<String> revertedCars = new ArrayList<>();

        for (int i = cars.length - 1; i >= 0; i--) {
            revertedCars.add(cars[i]);
        }
        return revertedCars;
    }


}
