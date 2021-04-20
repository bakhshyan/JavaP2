package JavaP1;

public class FirstandLastCharactersChangev2 {

    private String[] cars = {"Volvo", "BMW", "Ford", "Mazda", "Audi", "Deawoo", "Mercedes","Peugeot","Citroen"};

    public static void main(String[] args) {
        FirstandLastCharactersChangev2 firstandLastCharactersChangev2 = new FirstandLastCharactersChangev2();
        firstandLastCharactersChangev2.changingFirstAndLastCharacter();

    }

    private void changingFirstAndLastCharacter() {

        for (int i = 0; i < cars.length; i++) {
            if ((i + 1) % 2 == 0) {
                System.out.print(cars[i] + ".After changing is ");
                char[] car = cars[i].toCharArray();
                char firstCharacter = car[0];
                car[0] = car[car.length - 1];
                car[car.length - 1] = firstCharacter;
                System.out.println(String.valueOf(car));
            }

        }

    }
}
