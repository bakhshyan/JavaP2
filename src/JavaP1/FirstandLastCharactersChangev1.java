package JavaP1;

public class FirstandLastCharactersChangev1 {

    private String[] cars = {"Volvo", "BMW", "Ford", "Mazda", "Audi", "Deawoo", "Mercedes","Peugeot","Citroen"};

    public static void main(String[] args) {
        FirstandLastCharactersChangev1 firstandLastCharactersChangev1 = new FirstandLastCharactersChangev1();
        firstandLastCharactersChangev1.changingFirstAndLastCharacter();


    }

    private void changingFirstAndLastCharacter() {

        for (int i = 0; i < cars.length; i++) {
            if ((i + 1) % 2 == 0) {
                System.out.print(cars[i] + ".After changing is ");
                StringBuilder car = new StringBuilder(cars[i]);
                char firsCharacter = car.charAt(0);
                car.setCharAt(0, car.charAt(car.length() - 1));
                car.setCharAt(car.length() - 1, firsCharacter);
                System.out.println(car.toString());
            }
        }
    }
}
